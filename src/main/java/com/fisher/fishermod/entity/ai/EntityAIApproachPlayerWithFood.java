package com.fisher.fishermod.entity.ai;

import com.fisher.fishermod.entity.EntityWanderer;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EntityAIApproachPlayerWithFood extends EntityAIBase {
    private final EntityWanderer entity;
    private final double speed;
    private EntityPlayer closestPlayer;
    private int delayCounter;
    private final float maxDist;

    public EntityAIApproachPlayerWithFood(EntityWanderer entity, double speed, float maxDist) {
        this.entity = entity;
        this.speed = speed;
        this.maxDist = maxDist;
        this.setMutexBits(3); // Конфігурація завдань AI
    }

    @Override
    public boolean shouldExecute() {
        this.closestPlayer = this.entity.world.getClosestPlayerToEntity(this.entity, maxDist);
        return this.closestPlayer != null && this.isPlayerHoldingAllowedFood(this.closestPlayer);
    }

    @Override
    public boolean shouldContinueExecuting() {
        return this.closestPlayer != null && this.closestPlayer.isEntityAlive() && this.entity.getDistanceSq(this.closestPlayer) > 4.0D;
    }

    @Override
    public void startExecuting() {
        this.delayCounter = 0;
    }

    @Override
    public void resetTask() {
        this.closestPlayer = null;
        this.entity.getNavigator().clearPath();
    }

    @Override
    public void updateTask() {
        if (this.entity.getDistanceSq(this.closestPlayer) > 4.0D) {
            this.entity.getNavigator().tryMoveToEntityLiving(this.closestPlayer, this.speed);
        } else {
            this.entity.getNavigator().clearPath(); // Зупиняємо рух, якщо дистанція менше 2 блоків
        }
    }

    private boolean isPlayerHoldingAllowedFood(EntityPlayer player) {
        return WandererFoodList.isFoodAllowed(player.getHeldItemMainhand().getItem());
    }
}
