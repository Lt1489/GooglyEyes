package me.ichun.mods.googlyeyes.common.helper;

import net.minecraft.entity.EntityLivingBase;

public class HelperTesting extends HelperBase<EntityLivingBase>
{
    @Override
    public float getEyeSideOffset(EntityLivingBase living, float partialTick, int eye)
    {
        halfInterpupillaryDistance = 2F / 16F;
        return super.getEyeSideOffset(living, partialTick, eye);
    }

    @Override
    public float getEyeScale(EntityLivingBase living, float partialTick, int eye)
    {
        return 0.4F;
    }

    @Override
    public float[] getHeadJointOffset(EntityLivingBase living, float partialTick, int eye)
    {
        return new float[] { 0F, -10F/16F, 16F/16F };
    }

    @Override
    public float[] getEyeOffsetFromJoint(EntityLivingBase living, float partialTick, int eye)
    {
        return new float[] { 0F, -0.5F/16F, 3F/16F };
    }
}
