package me.ichun.mods.googlyeyes.common.helper;

import net.minecraft.entity.passive.AbstractHorse;

public class HelperHorse extends HelperBase<AbstractHorse>
{
    public HelperHorse()
    {
        headJoint = new float[] { 0F, -11F/16F, -9F/16F };
        eyeOffset = new float[] { 0F, 6F/16F, 5F/16F };
        halfInterpupillaryDistance = 3F/16F;
        eyeScale = 0.9F;
    }

    @Override
    public float getHeadYaw(AbstractHorse living, float partialTick, int eye)
    {
        return 180F;
    }

    @Override
    public float getHeadPitch(AbstractHorse living, float partialTick, int eye)
    {
        return (float)Math.toDegrees(living.getRearingAmount(partialTick) * ((float)Math.PI / 4F));
    }

    @Override
    public float getHeadYawForTracker(AbstractHorse living)
    {
        return living.renderYawOffset;
    }

    @Override
    public float getHeadPitchForTracker(AbstractHorse living)
    {
        return (float)Math.toDegrees(living.getRearingAmount(1F) * ((float)Math.PI / 4F));
    }
}
