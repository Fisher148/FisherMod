package com.fisher.fishermod.init;

import com.fisher.fishermod.blocks.Crockpot;
import com.fisher.fishermod.blocks.PewterBlock;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block PEWTER_BLOCK = new PewterBlock("pewter_block", Material.IRON);
    public static final Block CROCK_POT  = new Crockpot("crock_pot");
}