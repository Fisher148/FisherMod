package com.fisher.fishermod.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.World;

public class EntityAIDespawnAtNight extends EntityAIBase {
    private final EntityCreature entity;

    public EntityAIDespawnAtNight(EntityCreature entity) {
        this.entity = entity;
    }

    @Override
    public boolean shouldExecute() {
        World world = this.entity.world;
        return !world.isDaytime();  // Якщо потрібно, щоб сутність зникала вночі
    }
}
