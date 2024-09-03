package com.fisher.fishermod.entity;

import com.fisher.fishermod.entity.ai.WandererFoodList;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class EntityWanderer extends EntityCreature {
    
    private boolean hasAskedForFood = false;

    public EntityWanderer(World worldIn) {
        super(worldIn);
        this.setSize(0.6F, 1.7F);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D)); 
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();

        if (!this.world.isRemote && !this.hasAskedForFood) {
            EntityPlayer closestPlayer = this.world.getClosestPlayerToEntity(this, 4.0D);
            if (closestPlayer != null) {
                this.getLookHelper().setLookPositionWithEntity(closestPlayer, 30.0F, 30.0F);
                closestPlayer.sendMessage(new TextComponentTranslation("message.wanderer.ask"));
                this.hasAskedForFood = true;
            }
        }
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        ItemStack itemstack = player.getHeldItem(hand);

        if (WandererFoodList.isFoodAllowed(itemstack.getItem())) {
            if (!this.world.isRemote) {
                itemstack.shrink(1);

                // Викликаємо ефект на сервері для синхронізації з клієнтом
                this.world.playSound(null, this.posX, this.posY, this.posZ, SoundEvents.ENTITY_ENDERMEN_TELEPORT, this.getSoundCategory(), 1.0F, 1.0F);
                spawnDisappearParticles();

                this.entityDropItem(new ItemStack(Item.getItemFromBlock(Blocks.GLASS)), 1.0F);
                this.setDead();
            }
            return true;
        }

        return super.processInteract(player, hand);
    }

    private void spawnDisappearParticles() {
        if (!this.world.isRemote) {
            for (int i = 0; i < 20; i++) {
                double offsetX = (this.rand.nextDouble() - 0.5D) * 2.0D;
                double offsetY = this.rand.nextDouble() * 2.0D;
                double offsetZ = (this.rand.nextDouble() - 0.5D) * 2.0D;
                this.world.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY,
                                         this.posX + offsetX, 
                                         this.posY + offsetY + 1.0D, 
                                         this.posZ + offsetZ, 
                                         0.0D, 0.0D, 0.0D);
            }
        }
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return super.getHurtSound(source);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }
    
    @Override
    public boolean getCanSpawnHere() {
        // Дозволяємо спавн незалежно від рівня освітлення
        return super.getCanSpawnHere();
    }
    
}