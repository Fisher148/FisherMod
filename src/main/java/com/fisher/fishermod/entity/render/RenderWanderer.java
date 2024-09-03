package com.fisher.fishermod.entity.render;


import javax.annotation.Nullable;

import com.fisher.fishermod.entity.EntityWanderer;
import com.fisher.fishermod.entity.model.ModelWanderer;
import com.fisher.fishermod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;


public class RenderWanderer extends RenderLiving<EntityWanderer> 
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/wanderer.png");

    public RenderWanderer(RenderManager manager)
    {
        super(manager, new ModelWanderer(), 0.5F);
    }
    
    @Override
    @Nullable
    protected ResourceLocation getEntityTexture(EntityWanderer entity) {
        return TEXTURES;
    }
    
    @Override
    protected void applyRotations(EntityWanderer entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}