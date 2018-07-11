package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.entity.Entity;

/**
 * Red-Billed Hornbill Flying - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelRedBilledTropicbirdFlying extends AdvancedModelBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer rightwing;
    public AdvancedModelRenderer leftwing;
    public AdvancedModelRenderer leftleg;
    public AdvancedModelRenderer rightleg;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer rightwing2;
    public AdvancedModelRenderer rightwing3;
    public AdvancedModelRenderer leftwing2;
    public AdvancedModelRenderer leftwing3;
    public AdvancedModelRenderer neck2;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer beak;
    public AdvancedModelRenderer beak2;
    public AdvancedModelRenderer righttail;
    public AdvancedModelRenderer lefttail;
    public AdvancedModelRenderer middletail1;
    public AdvancedModelRenderer middletail2;
    public AdvancedModelRenderer middletail12;
    public AdvancedModelRenderer miggletail13;
    public AdvancedModelRenderer middletail22;
    public AdvancedModelRenderer middletail23;

    public ModelRedBilledTropicbirdFlying() {
        this.textureWidth = 64;
        this.textureHeight = 30;
        this.beak2 = new AdvancedModelRenderer(this, 45, 24);
        this.beak2.setRotationPoint(-0.2F, -3.7F, 0.0F);
        this.beak2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(beak2, -0.136659280431156F, 0.0F, 0.0F);
        this.body = new AdvancedModelRenderer(this, 1, 20);
        this.body.setRotationPoint(0.0F, 17.2F, 0.0F);
        this.body.addBox(-1.9F, 0.0F, -2.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.008203047484373348F);
        this.neck2 = new AdvancedModelRenderer(this, 22, 23);
        this.neck2.setRotationPoint(0.5F, -0.4F, -2.1F);
        this.neck2.addBox(-1.5F, -2.0F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck2, 1.2747884856566583F, 0.0F, 0.0F);
        this.middletail2 = new AdvancedModelRenderer(this, -8, 2);
        this.middletail2.setRotationPoint(-0.5F, 0.4F, 2.4F);
        this.middletail2.addBox(0.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
        this.middletail12 = new AdvancedModelRenderer(this, 3, 6);
        this.middletail12.setRotationPoint(1.0F, 0.0F, 9.9F);
        this.middletail12.addBox(-1.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F);
        this.setRotateAngle(middletail12, -0.136659280431156F, 0.27314402793711257F, 0.0F);
        this.rightwing3 = new AdvancedModelRenderer(this, 53, 19);
        this.rightwing3.setRotationPoint(0.0F, 0.1F, 2.6F);
        this.rightwing3.addBox(0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(rightwing3, 0.27314402793711257F, 0.045553093477052F, 0.0F);
        this.leftwing2 = new AdvancedModelRenderer(this, 41, 11);
        this.leftwing2.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.leftwing2.addBox(0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(leftwing2, -0.23736477827122882F, 0.045553093477052F, 0.0F);
        this.middletail22 = new AdvancedModelRenderer(this, 3, 6);
        this.middletail22.setRotationPoint(0.0F, 0.0F, 9.9F);
        this.middletail22.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F);
        this.setRotateAngle(middletail22, -0.136659280431156F, -0.27314402793711257F, 0.0F);
        this.leftleg = new AdvancedModelRenderer(this, 24, 4);
        this.leftleg.setRotationPoint(0.5F, 2.5F, 1.7F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.9560913642424937F, 0.0F, 0.0F);
        this.righttail = new AdvancedModelRenderer(this, 13, 9);
        this.righttail.setRotationPoint(-1.0F, 0.6F, 1.6F);
        this.righttail.addBox(0.0F, 0.0F, 0.1F, 1, 1, 4, 0.0F);
        this.setRotateAngle(righttail, 0.0F, -0.27314402793711257F, 0.0F);
        this.leftwing = new AdvancedModelRenderer(this, 35, 1);
        this.leftwing.setRotationPoint(1.8F, 0.7F, -0.3F);
        this.leftwing.addBox(0.0F, -1.5F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(leftwing, 1.3658946726107624F, 0.045553093477052F, 1.5481070465189704F);
        this.beak = new AdvancedModelRenderer(this, 45, 24);
        this.beak.setRotationPoint(-0.2F, -4.6F, -0.3F);
        this.beak.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(beak, 0.18203784098300857F, 0.0F, 0.0F);
        this.lefttail = new AdvancedModelRenderer(this, 13, 9);
        this.lefttail.setRotationPoint(1.0F, 0.6F, 1.6F);
        this.lefttail.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(lefttail, 0.0F, 0.27314402793711257F, 0.0F);
        this.middletail1 = new AdvancedModelRenderer(this, -8, 2);
        this.middletail1.setRotationPoint(-0.5F, 0.5F, 2.4F);
        this.middletail1.addBox(0.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
        this.rightleg = new AdvancedModelRenderer(this, 24, 4);
        this.rightleg.setRotationPoint(-1.5F, 2.6F, 1.5F);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 1.0471975511965976F, 0.0F, 0.0F);
        this.body2 = new AdvancedModelRenderer(this, 1, 13);
        this.body2.setRotationPoint(0.0F, 0.1F, 3.2F);
        this.body2.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(body2, -0.18203784098300857F, 0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 31, 23);
        this.head.setRotationPoint(-0.8F, -0.6F, -0.9F);
        this.head.addBox(-1.2F, -2.7F, -1.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, 0.36425021489121656F, 0.0F, 0.0F);
        this.miggletail13 = new AdvancedModelRenderer(this, 6, 6);
        this.miggletail13.setRotationPoint(-1.0F, 0.0F, 4.0F);
        this.miggletail13.addBox(0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F);
        this.setRotateAngle(miggletail13, -0.31869712141416456F, 0.0F, 0.0F);
        this.middletail23 = new AdvancedModelRenderer(this, 6, 7);
        this.middletail23.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.middletail23.addBox(0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F);
        this.setRotateAngle(middletail23, -0.31869712141416456F, 0.0F, 0.0F);
        this.rightwing = new AdvancedModelRenderer(this, 50, 1);
        this.rightwing.setRotationPoint(-1.4F, 1.2F, 0.7F);
        this.rightwing.addBox(-0.5F, -1.5F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(rightwing, -1.3658946726107624F, 0.091106186954104F, 1.593485607070823F);
        this.neck = new AdvancedModelRenderer(this, 19, 17);
        this.neck.setRotationPoint(0.0F, 0.9F, -0.8F);
        this.neck.addBox(-1.5F, -0.9F, -2.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(neck, 0.091106186954104F, 0.0F, 0.0F);
        this.leftwing3 = new AdvancedModelRenderer(this, 31, 14);
        this.leftwing3.setRotationPoint(0.0F, 0.1F, 2.6F);
        this.leftwing3.addBox(0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(leftwing3, -0.27314402793711257F, 0.045553093477052F, 0.0F);
        this.rightwing2 = new AdvancedModelRenderer(this, 53, 11);
        this.rightwing2.setRotationPoint(-0.5F, 1.0F, 4.5F);
        this.rightwing2.addBox(0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(rightwing2, 0.22759093446006054F, 0.045553093477052F, 0.0F);
        this.head.addChild(this.beak2);
        this.neck.addChild(this.neck2);
        this.body2.addChild(this.middletail2);
        this.middletail1.addChild(this.middletail12);
        this.rightwing2.addChild(this.rightwing3);
        this.leftwing.addChild(this.leftwing2);
        this.middletail2.addChild(this.middletail22);
        this.body.addChild(this.leftleg);
        this.body2.addChild(this.righttail);
        this.body.addChild(this.leftwing);
        this.head.addChild(this.beak);
        this.body2.addChild(this.lefttail);
        this.body2.addChild(this.middletail1);
        this.body.addChild(this.rightleg);
        this.body.addChild(this.body2);
        this.neck2.addChild(this.head);
        this.middletail12.addChild(this.miggletail13);
        this.middletail22.addChild(this.middletail23);
        this.body.addChild(this.rightwing);
        this.body.addChild(this.neck);
        this.leftwing2.addChild(this.leftwing3);
        this.rightwing.addChild(this.rightwing2);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	resetToDefaultPose();
    	
    	float globalSpeed = 1.75f;
    	float globalDegree = 1F;
    	
    	walk(leftwing, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0, 0f, f, f1);
    	walk(rightwing, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0, 0f, f, f1);
    	flap(leftwing, 0.3f * globalSpeed, 0.6f * globalDegree, false, 0, 0f, f, f1);
    	flap(rightwing, 0.3f * globalSpeed, 0.6f * globalDegree, true, 0, 0f, f, f1);
 
    	walk(middletail1, 0.2f * globalSpeed, 0.3f * globalDegree, true, -3f, 0f, f, f1);
    	walk(middletail2, 0.2f * globalSpeed, 0.3f * globalDegree, true, -3f, 0f, f, f1);
    	walk(middletail12, 0.3f, 0.6f, true, -3f, 0f, f, f1);
    	walk(middletail22, 0.3f, 0.6f, true, -3f, 0f, f, f1);
    	walk(miggletail13, 0.3f, 0.5f, false, 0f, 0f, f, f1);
    	walk(middletail23, 0.3f, 0.5f, false, 0f, 0f, f, f1);
    }
}