package com.fisher.fishermod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PewterBlock extends BlockBase
{

    public PewterBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL); //звук
        setHardness(5f); //міцність
        setResistance(20f);//резіст до вибухів
        setHarvestLevel("pickaxe", 2); // рівень кирки "pickaxe" - інструмент; 2 - рівень кирки (жілізна)
        //setLightLevel() рівень світла
        setLightOpacity(0);// як легко світло проходить через блок
        //setBlockUnbreakable() незламність
    }

    
}