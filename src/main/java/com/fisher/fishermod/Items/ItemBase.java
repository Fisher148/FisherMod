package com.fisher.fishermod.Items;

import com.fisher.fishermod.Main;
import com.fisher.fishermod.init.ModItems;
import com.fisher.fishermod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() 
    {
        Main.clientProxy.registerItemRenderer(this, 0, "inventory");
    }

}
