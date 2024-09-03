package com.fisher.fishermod.entity.ai;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import java.util.Arrays;
import java.util.List;

public class ModBiomes {
    
    public static final List<Biome> VALID_BIOMES = Arrays.asList(
        Biomes.PLAINS,
        Biomes.FOREST,
        Biomes.SWAMPLAND,
        Biomes.TAIGA,
        Biomes.ICE_PLAINS,
        Biomes.MUSHROOM_ISLAND,
        Biomes.JUNGLE,
        Biomes.BIRCH_FOREST,
        Biomes.EXTREME_HILLS,
        Biomes.ROOFED_FOREST,
        Biomes.SAVANNA
        // Додайте інші біоми за необхідністю
    );
}
