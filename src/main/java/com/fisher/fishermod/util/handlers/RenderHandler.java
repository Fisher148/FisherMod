package com.fisher.fishermod.util.handlers;


import com.fisher.fishermod.entity.EntityWanderer;
import com.fisher.fishermod.entity.render.RenderWanderer;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityWanderer.class, new IRenderFactory<EntityWanderer>()
        {
            @Override
            public Render<? super EntityWanderer> createRenderFor(RenderManager manager) {
                return new RenderWanderer(manager);
            }
});
}

}