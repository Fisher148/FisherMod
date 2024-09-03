package com.fisher.fishermod.entity.ai;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.HashSet;
import java.util.Set;

public class WandererFoodList {

    private static final Set<Item> ALLOWED_FOODS = new HashSet<>();

    static {
        ALLOWED_FOODS.add(Items.APPLE);
        ALLOWED_FOODS.add(Items.BAKED_POTATO);
        ALLOWED_FOODS.add(Items.BEETROOT);
        ALLOWED_FOODS.add(Items.BEETROOT_SOUP);
        ALLOWED_FOODS.add(Items.BREAD);
        ALLOWED_FOODS.add(Items.CAKE);
        ALLOWED_FOODS.add(Items.COOKIE);
        ALLOWED_FOODS.add(Items.COOKED_BEEF);
        ALLOWED_FOODS.add(Items.COOKED_CHICKEN);
        ALLOWED_FOODS.add(Items.COOKED_MUTTON);
        ALLOWED_FOODS.add(Items.COOKED_PORKCHOP);
        ALLOWED_FOODS.add(Items.COOKED_RABBIT);
        ALLOWED_FOODS.add(Items.GOLDEN_APPLE);
        ALLOWED_FOODS.add(Items.GOLDEN_CARROT);
        ALLOWED_FOODS.add(Items.MELON);
        ALLOWED_FOODS.add(Items.MUSHROOM_STEW);
        ALLOWED_FOODS.add(Items.PUMPKIN_PIE);
        ALLOWED_FOODS.add(Items.RABBIT_STEW);
        ALLOWED_FOODS.add(Items.ROTTEN_FLESH); 
        ALLOWED_FOODS.add(Items.SPIDER_EYE);
        ALLOWED_FOODS.add(Items.COOKIE);
        ALLOWED_FOODS.add(Items.CHORUS_FRUIT);
    }

    public static boolean isFoodAllowed(Item item) {
        return ALLOWED_FOODS.contains(item);
    }
}
