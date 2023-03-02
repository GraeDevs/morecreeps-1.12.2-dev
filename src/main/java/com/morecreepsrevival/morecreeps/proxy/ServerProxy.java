package com.morecreepsrevival.morecreeps.proxy;

import com.morecreepsrevival.morecreeps.common.capabilities.IPlayerJumping;
import com.morecreepsrevival.morecreeps.common.capabilities.PlayerJumpingProvider;
import com.morecreepsrevival.morecreeps.common.entity.EntityCreepBase;
import com.morecreepsrevival.morecreeps.common.entity.EntityExtinguisherSmoke;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.SERVER)
public class ServerProxy implements IProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
    }

    @Override
    public boolean isJumpKeyDown(EntityPlayer player)
    {
        IPlayerJumping capability = player.getCapability(PlayerJumpingProvider.capability, null);

        if (capability != null)
        {
            return capability.getJumping();
        }

        return false;
    }

    @Override
    public void pee(EntityCreepBase entity)
    {
    }

    public void foam(EntityPlayer entity) {
    }

    public void foame(EntityExtinguisherSmoke entity) {
    }
}
