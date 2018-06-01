package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelXenopus;
import com.ikerleon.naturalfaunamod.entity.EntityXenopus;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderXenopus extends RenderLivingZAWA<EntityXenopus> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/xenopus/texture.png");

	public RenderXenopus(RenderManager rm) {
		super(rm, new ModelXenopus(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityXenopus entity)
    {
    	if(entity.isChild()) {
    		return ZAWARenderUtils.none;
    	}
    	else {
    		return getTextureOfVar(0);
    	}
    }

	@Override
	public ResourceLocation getTextureOfVar(int varient) {
		switch (varient) {
			case 0:
			default:
				return texture;
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityXenopus>{
	@Override
	public Render<? super EntityXenopus> createRenderFor(RenderManager manager) {
		return new RenderXenopus(manager);
	    }
    }
}
