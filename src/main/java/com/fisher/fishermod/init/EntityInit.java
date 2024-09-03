package com.fisher.fishermod.init;

import com.fisher.fishermod.Main;
import com.fisher.fishermod.entity.EntityWanderer;
import com.fisher.fishermod.entity.ai.ModBiomes;
import com.fisher.fishermod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
    public static void registerEntities() {
        registerEntity("wanderer", EntityWanderer.class, Reference.ENTITY_WANDERER, 50, 10252655, 11575663);

        EntityRegistry.addSpawn(EntityWanderer.class, 100, 1, 1, EnumCreatureType.CREATURE, ModBiomes.VALID_BIOMES.toArray(new Biome[0]));
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }
}
