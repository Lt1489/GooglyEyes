package me.ichun.mods.googlyeyes.common.helper;

import net.minecraft.entity.passive.EntitySquid;

public class HelperSquid extends HelperBase<EntitySquid>
{
    public HelperSquid()
    {
        headJoint = new float[]{ 0F, -8F/16F, 0F };
        eyeOffset = new float[]{ 0F, 1F/16F, 6F/16F };
        halfInterpupillaryDistance = 3F/16F;
    }

    @Override
    public float getHeadYaw(EntitySquid living, float partialTick, int eye)
    {
        return 0F;
    }

    @Override
    public float getHeadPitch(EntitySquid living, float partialTick, int eye)
    {
        return 0F;
    }

    @Override
    public float getHeadYawForTracker(EntitySquid living)
    {
        return -living.squidYaw;
    }

    @Override
    public float getHeadPitchForTracker(EntitySquid living)
    {
        return -living.squidPitch;
    }
}
