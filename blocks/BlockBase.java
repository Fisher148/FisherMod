package com.fisher.fishermod.blocks;

import com.fisher.fishermod.Main;
import com.fisher.fishermod.init.ModBlocks;
import com.fisher.fishermod.init.ModItems;
import com.fisher.fishermod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
    Main.clientProxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");
}
}