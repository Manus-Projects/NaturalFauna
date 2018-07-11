package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * BlueGnuCalf - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelBlueGnuChild extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer neck;
    public ModelRenderer frontrightleg;
    public ModelRenderer frontleftleg;
    public ModelRenderer body2;
    public ModelRenderer head;
    public ModelRenderer crest;
    public ModelRenderer crestdown;
    public ModelRenderer leftear;
    public ModelRenderer rightear;
    public ModelRenderer snout;
    public ModelRenderer frontrightleg2;
    public ModelRenderer frontleftleg2;
    public ModelRenderer backrightleg;
    public ModelRenderer body3;
    public ModelRenderer backleftleg;
    public ModelRenderer backrightleg2;
    public ModelRenderer backrightleg3;
    public ModelRenderer tail;
    public ModelRenderer tail2;
    public ModelRenderer backleftleg2;
    public ModelRenderer backleftleg3;

    public ModelBlueGnuChild() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.backrightleg2 = new ModelRenderer(this, 0, 4);
        this.backrightleg2.setRotationPoint(-0.5F, 6.0F, -1.5F);
        this.backrightleg2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backrightleg2, 0.8196066167365371F, 0.0F, 0.0F);
        this.frontrightleg = new ModelRenderer(this, 0, 2);
        this.frontrightleg.setRotationPoint(0.5F, 4.3F, 2.0F);
        this.frontrightleg.addBox(-1.0F, 0.0F, -1.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(frontrightleg, 0.045553093477052F, 0.0F, 0.0F);
        this.frontleftleg = new ModelRenderer(this, 0, 2);
        this.frontleftleg.setRotationPoint(6.5F, 4.3F, 2.0F);
        this.frontleftleg.addBox(-1.0F, 0.0F, -1.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(frontleftleg, 0.045553093477052F, 0.0F, 0.0F);
        this.backrightleg = new ModelRenderer(this, 27, 0);
        this.backrightleg.setRotationPoint(0.4F, 4.0F, 6.9F);
        this.backrightleg.addBox(-1.0F, 0.0F, -1.5F, 3, 7, 4, 0.0F);
        this.tail2 = new ModelRenderer(this, 39, 42);
        this.tail2.setRotationPoint(0.0F, 2.7F, 1.0F);
        this.tail2.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(tail2, -0.136659280431156F, 0.0F, 0.0F);
        this.crest = new ModelRenderer(this, 0, 42);
        this.crest.setRotationPoint(-0.3F, -4.0F, -8.3F);
        this.crest.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.frontrightleg2 = new ModelRenderer(this, 0, 4);
        this.frontrightleg2.setRotationPoint(0.5F, 6.6F, 0.5F);
        this.frontrightleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.head = new ModelRenderer(this, 28, 26);
        this.head.setRotationPoint(-0.3F, -0.1F, -7.0F);
        this.head.addBox(-2.7F, -3.0F, -4.0F, 6, 7, 4, 0.0F);
        this.body2 = new ModelRenderer(this, 11, 9);
        this.body2.setRotationPoint(0.5F, 0.1F, 6.5F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 7, 9, 8, 0.0F);
        this.setRotateAngle(body2, 0.045553093477052F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 27, 2);
        this.body3.setRotationPoint(0.5F, 0.0F, 7.0F);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 6, 8, 4, 0.0F);
        this.setRotateAngle(body3, -0.136659280431156F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 9, 8);
        this.body.setRotationPoint(-4.1F, 6.3F, -6.6F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(body, -0.045553093477052F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 0, 0);
        this.tail.setRotationPoint(3.0F, 1.3F, 2.7F);
        this.tail.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(tail, 0.31869712141416456F, 0.0F, 0.0F);
        this.rightear = new ModelRenderer(this, 34, 3);
        this.rightear.setRotationPoint(-2.5F, 0.5F, -0.8F);
        this.rightear.addBox(-3.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(rightear, 0.0F, 0.22759093446006054F, 0.4553564018453205F);
        this.backleftleg2 = new ModelRenderer(this, 0, 4);
        this.backleftleg2.setRotationPoint(1.5F, 6.0F, -1.5F);
        this.backleftleg2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backleftleg2, 0.8196066167365371F, 0.0F, 0.0F);
        this.leftear = new ModelRenderer(this, 0, 2);
        this.leftear.setRotationPoint(2.0F, -1.2F, -1.0F);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(leftear, 0.0F, -0.22759093446006054F, -0.4553564018453205F);
        this.backrightleg3 = new ModelRenderer(this, 0, 4);
        this.backrightleg3.setRotationPoint(0.1F, 2.5F, 1.6F);
        this.backrightleg3.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(backrightleg3, -0.8196066167365371F, 0.0F, 0.0F);
        this.backleftleg = new ModelRenderer(this, 25, 0);
        this.backleftleg.setRotationPoint(3.5F, 4.0F, 6.9F);
        this.backleftleg.addBox(1.0F, 0.0F, -1.5F, 3, 7, 4, 0.0F);
        this.snout = new ModelRenderer(this, 0, 42);
        this.snout.setRotationPoint(-1.2F, -1.6F, -4.5F);
        this.snout.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(snout, -0.136659280431156F, 0.0F, 0.0F);
        this.backleftleg3 = new ModelRenderer(this, 0, 4);
        this.backleftleg3.setRotationPoint(0.1F, 2.5F, 1.6F);
        this.backleftleg3.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(backleftleg3, -0.8196066167365371F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 26);
        this.neck.setRotationPoint(4.2F, 3.2F, 2.1F);
        this.neck.addBox(-2.6F, -3.0F, -9.5F, 5, 7, 9, 0.0F);
        this.setRotateAngle(neck, 0.091106186954104F, 0.0F, 0.0F);
        this.crestdown = new ModelRenderer(this, 19, 37);
        this.crestdown.setRotationPoint(-0.5F, 2.4F, -8.5F);
        this.crestdown.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
        this.setRotateAngle(crestdown, -0.045553093477052F, 0.0F, 0.0F);
        this.frontleftleg2 = new ModelRenderer(this, 0, 5);
        this.frontleftleg2.setRotationPoint(-0.5F, 6.7F, -0.5F);
        this.frontleftleg2.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.backrightleg.addChild(this.backrightleg2);
        this.body.addChild(this.frontrightleg);
        this.body.addChild(this.frontleftleg);
        this.body2.addChild(this.backrightleg);
        this.tail.addChild(this.tail2);
        this.neck.addChild(this.crest);
        this.frontrightleg.addChild(this.frontrightleg2);
        this.neck.addChild(this.head);
        this.body.addChild(this.body2);
        this.body2.addChild(this.body3);
        this.body3.addChild(this.tail);
        this.head.addChild(this.rightear);
        this.backleftleg.addChild(this.backleftleg2);
        this.head.addChild(this.leftear);
        this.backrightleg2.addChild(this.backrightleg3);
        this.body2.addChild(this.backleftleg);
        this.head.addChild(this.snout);
        this.backleftleg2.addChild(this.backleftleg3);
        this.body.addChild(this.neck);
        this.neck.addChild(this.crestdown);
        this.frontleftleg.addChild(this.frontleftleg2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}