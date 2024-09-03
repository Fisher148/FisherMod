package com.fisher.fishermod.entity.ai;

import com.fisher.fishermod.entity.EntityWanderer;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class EntityAIRewardForFood extends EntityAIBase {
    private final EntityWanderer entity;
    private final double speed;
    private EntityPlayer closestPlayer;
    private int delayCounter;

    public EntityAIRewardForFood(EntityWanderer entity, double speed) {
        this.entity = entity;
        this.speed = speed;
        this.setMutexBits(3);
    }

    @Override
    public boolean shouldExecute() {
        World world = this.entity.world;
        this.closestPlayer = world.getClosestPlayerToEntity(this.entity, 10.0D);
        if (this.closestPlayer == null) {
            return false;
        } else {
            return this.isPlayerHoldingAllowedFood(this.closestPlayer);
        }
    }

    @Override
    public boolean shouldContinueExecuting() {
        return this.closestPlayer != null && this.closestPlayer.isEntityAlive() && this.delayCounter > 0;
    }

    @Override
    public void startExecuting() {
        this.delayCounter = 40; // Взаємодія триватиме 2 секунди (40 тік)
    }

    @Override
    public void resetTask() {
        this.closestPlayer = null;
    }

    @Override
    public void updateTask() {
        this.entity.getLookHelper().setLookPositionWithEntity(this.closestPlayer, 30.0F, 30.0F);
        this.entity.getNavigator().tryMoveToEntityLiving(this.closestPlayer, this.speed);
        --this.delayCounter;
    
        if (this.delayCounter <= 0 && this.closestPlayer != null) {
            ItemStack itemstack = this.closestPlayer.getHeldItemMainhand();
            if (this.isPlayerHoldingAllowedFood(this.closestPlayer)) {
                // Викидає скло як винагороду
                this.entity.dropItem(Item.getItemFromBlock(Blocks.GLASS), 1); // Викидає скляний блок
                itemstack.shrink(1); // Зменшити кількість їжі на 1
                this.resetTask(); // Завершити завдання
            }
            
        }
    }

    private boolean isPlayerHoldingAllowedFood(EntityPlayer player) {
        ItemStack itemstack = player.getHeldItemMainhand();
        return WandererFoodList.isFoodAllowed(itemstack.getItem());
    }
}
