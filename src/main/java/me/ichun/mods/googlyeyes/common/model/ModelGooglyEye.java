package me.ichun.mods.googlyeyes.common.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Googly Eyes - iChun
 * Created using Tabula 5.1.0
 */
public class ModelGooglyEye extends ModelBase {
    public ModelRenderer iris12;
    public ModelRenderer iris11;
    public ModelRenderer iris10;
    public ModelRenderer iris9;
    public ModelRenderer iris8;
    public ModelRenderer iris7;
    public ModelRenderer iris6;
    public ModelRenderer iris5;
    public ModelRenderer iris4;
    public ModelRenderer iris3;
    public ModelRenderer iris2;
    public ModelRenderer iris1;
    public ModelRenderer pupil6;
    public ModelRenderer pupil5;
    public ModelRenderer pupil4;
    public ModelRenderer pupil3;
    public ModelRenderer pupil2;
    public ModelRenderer pupil1;

    public ModelGooglyEye()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.iris6 = new ModelRenderer(this, 0, 0);
        this.iris6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris6.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris6, 0.0F, -0.0F, -3.141592653589793F);
        this.iris12 = new ModelRenderer(this, 0, 0);
        this.iris12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris12.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.iris2 = new ModelRenderer(this, 0, 0);
        this.iris2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris2.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris2, 0.0F, -0.0F, -1.0471975511965976F);
        this.iris1 = new ModelRenderer(this, 0, 0);
        this.iris1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris1.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris1, 0.0F, -0.0F, -0.5235987755982988F);
        this.iris11 = new ModelRenderer(this, 0, 0);
        this.iris11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris11.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris11, 0.0F, -0.0F, 0.5235987755982988F);
        this.pupil1 = new ModelRenderer(this, 0, 0);
        this.pupil1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pupil1.addBox(-0.5F, -0.88F, -1.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(pupil1, 0.0F, -0.0F, -1.0471975511965976F);
        this.iris4 = new ModelRenderer(this, 0, 0);
        this.iris4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris4.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris4, 0.0F, -0.0F, -2.0943951023931953F);
        this.pupil4 = new ModelRenderer(this, 0, 0);
        this.pupil4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pupil4.addBox(-0.5F, -0.88F, -1.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(pupil4, 0.0F, -0.0F, 2.0943951023931953F);
        this.iris5 = new ModelRenderer(this, 0, 0);
        this.iris5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris5.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris5, 0.0F, -0.0F, -2.6179938779914944F);
        this.iris7 = new ModelRenderer(this, 0, 0);
        this.iris7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris7.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris7, 0.0F, -0.0F, 2.6179938779914944F);
        this.pupil6 = new ModelRenderer(this, 0, 0);
        this.pupil6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pupil6.addBox(-0.5F, -0.88F, -1.5F, 1, 1, 1, 0.0F);
        this.pupil5 = new ModelRenderer(this, 0, 0);
        this.pupil5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pupil5.addBox(-0.5F, -0.88F, -1.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(pupil5, 0.0F, -0.0F, 1.0471975511965976F);
        this.iris3 = new ModelRenderer(this, 0, 0);
        this.iris3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris3.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris3, 0.0F, -0.0F, -1.5707963267948966F);
        this.pupil3 = new ModelRenderer(this, 0, 0);
        this.pupil3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pupil3.addBox(-0.5F, -0.88F, -1.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(pupil3, 0.0F, -0.0F, -3.141592653589793F);
        this.iris9 = new ModelRenderer(this, 0, 0);
        this.iris9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris9.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris9, 0.0F, -0.0F, 1.5707963267948966F);
        this.pupil2 = new ModelRenderer(this, 0, 0);
        this.pupil2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pupil2.addBox(-0.5F, -0.88F, -1.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(pupil2, 0.0F, -0.0F, -2.0943951023931953F);
        this.iris10 = new ModelRenderer(this, 0, 0);
        this.iris10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris10.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris10, 0.0F, 0.0F, 1.0471975511965976F);
        this.iris8 = new ModelRenderer(this, 0, 0);
        this.iris8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.iris8.addBox(-0.5F, -1.88F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(iris8, 0.0F, -0.0F, 2.0943951023931953F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public void renderIris(float f5)
    {
        this.iris1.render(f5);
        this.iris2.render(f5);
        this.iris3.render(f5);
        this.iris4.render(f5);
        this.iris5.render(f5);
        this.iris6.render(f5);
        this.iris7.render(f5);
        this.iris8.render(f5);
        this.iris9.render(f5);
        this.iris10.render(f5);
        this.iris11.render(f5);
        this.iris12.render(f5);
    }

    public void renderPupil(float f5)
    {
        this.pupil1.render(f5);
        this.pupil2.render(f5);
        this.pupil3.render(f5);
        this.pupil4.render(f5);
        this.pupil5.render(f5);
        this.pupil6.render(f5);
    }

    public void movePupilAndRender(float x, float y, float f5)
    {
        renderIris(f5);
        renderPupil(f5);
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
