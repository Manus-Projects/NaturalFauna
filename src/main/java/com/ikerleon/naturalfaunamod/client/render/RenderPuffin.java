package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelPuffin;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPuffin extends RenderLivingZAWA<EntityPuffin> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/puffin/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/puffin/child_texture.png");

	public RenderPuffin(RenderManager rm) {
		super(rm, new ModelPuffin(), 0.4F);
	}
	
    protected ResourceLocation getEntityTexture(EntityPuffin entity)
    {
    	if(entity.isChild() || entity.isInWater()) {
    		return ZAWARenderUtils.none;
    	}
    	else {
    		return getTextureOfVar(entity.getAnimalType());
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
	
	@SideOnly(Side.CLIENT)
	public class LayerPuffin implements LayerRenderer<EntityPuffin> {
	    private final RenderPuffin render;
	    private final ModelPuffin modelBaby = new ModelPuffin();
	    private final ModelPuffin modelBabyWater = new ModelPuffin();
	    private final ModelPuffin modelWater = new ModelPuffin();
		 
	    public LayerPuffin(RenderPuffin re)
	    {
	        this.render = re;
	    }
	 
	    public void doRenderLayer(EntityPuffin kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	    {	    	
	        if (!kat.isInvisible())
	        {
	        	if(kat.isChild() && kat.isInWater()) {
		            this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
		            this.modelBabyWater.setModelAttributes(this.render.getMainModel());
		            this.modelBabyWater.setRotationAngles(f,f1,f3,f4,f5,f6, kat);
		            this.modelBabyWater.render(kat, f, f1, f2, f3, f4, f6);
	        	}
	        	else if(kat.isChild()) {
		            this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
		            this.modelBaby.setModelAttributes(this.render.getMainModel());
		            this.modelBaby.setRotationAngles(f,f1,f3,f4,f5,f6, kat);
		            this.modelBaby.render(kat, f, f1, f2, f3, f4, f6);
	        	}
	        	else if(kat.isInWater()) {
	        		this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
		            this.modelWater.setModelAttributes(this.render.getMainModel());
		            this.modelWater.setRotationAngles(f,f1,f3,f4,f5,f6, kat);
		            this.modelWater.render(kat, f, f1, f2, f3, f4, f6);
	        	}
	        }
	    }
	    
		@Override
		public boolean shouldCombineTextures() {
			return true;
		}
	}
	
	public static class RenderFactory implements IRenderFactory<EntityPuffin>{
		@Override
		public Render<? super EntityPuffin> createRenderFor(RenderManager manager) {
			return new RenderPuffin(manager);
		}
	}
}
