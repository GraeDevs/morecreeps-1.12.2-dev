package com.morecreepsrevival.morecreeps.proxy;

import com.morecreepsrevival.morecreeps.common.entity.EntityCreepBase;
import com.morecreepsrevival.morecreeps.common.entity.EntityExtinguisherSmoke;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy
{
    void preInit(FMLPreInitializationEvent event);

    void init(FMLInitializationEvent event);

    void postInit(FMLPostInitializationEvent event);

    boolean isJumpKeyDown(EntityPlayer player);

    void pee(EntityCreepBase entity);

    void foam(EntityPlayer var1);

    void foame(EntityExtinguisherSmoke var1);
}
