package com.ikerleon.naturalfaunamod.entity;

import java.util.Random;

import org.zawamod.entity.base.ZAWABaseFlying;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityRedBilledTropicbird extends ZAWABaseFlying{
	
	Random random = new Random();

	public EntityRedBilledTropicbird(World worldIn) {		
		super(worldIn);
		this.setSize(0.75F, 0.5F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.20D));
        this.tasks.addTask(0, new EntityAILookIdle(this));
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
	
	@Override
	public int setVariants() {
		return 1;
	}
	
	public int setFlyTicks()
	{
	    return 350;
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
	    if(!this.onGround && !this.isInWater()) {
	    	return SoundHandler.TROPICBIRD_FLYING;
	    }
	    else {
	    	return null;
	    }
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.PescatarianItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.BIRD_KIBBLE, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.BIRD_VIAL, 1);
	}
	
	@Override
	public void onLivingUpdate() {
		if(this.onGround) {
			this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0D);
		}
		else {
			this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
		}
		super.onLivingUpdate();
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		return super.attackEntityFrom(source, amount);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0D);
	}

	@Override
	public void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning()) {
			this.dropItem(ZAWAItems.BIRD_MEAT_COOKED, 1);
		}
		else {
			this.dropItem(ZAWAItems.BIRD_MEAT, 1);
		    this.dropItem(ItemInit.REDBILLEDTROPICBIRD_FEATHER, 1);
		}	    
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityRedBilledTropicbird(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PASSIVE;
	}
}
