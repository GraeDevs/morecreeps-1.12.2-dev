package com.morecreepsrevival.morecreeps.common.items;

import com.morecreepsrevival.morecreeps.common.MoreCreepsAndWeirdos;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber(modid = MoreCreepsAndWeirdos.modid)
public class CreepsItemHandler
{
    public static final CreativeTabs creativeTab = new CreativeTabs("creepsTab")
    {
        public ItemStack getTabIconItem()
        {
            return new ItemStack(floobAchievement);
        }
    };

    public static final Item floobAchievement = new CreepsItem("floob_achievement");

    public static final Item goToHellAchievement = new CreepsItem("gotohell_achievement");

    public static final Item pigWhispererAchievement = new CreepsItem("pigwhisperer_achievement");

    public static final Item theZipperAchievement = new CreepsItem("thezipper_achievement");
    public static ArmorMaterial ZEBRA_ARMOR = EnumHelper.addArmorMaterial("zebra_armor", "zebra_armor", 25, new int[] {2, 4, 6, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);

    public static final Item guineaPigRadio = new ItemGuineaPigRadio();

    public static final Item lifeGem = new ItemLifeGem();

    public static final Item bandaid = new ItemBandaid();

    public static final Item popsicle = new ItemPopsicle();

    public static final Item blorpCola = new ItemBlorpCola();

    public static final Item money = new ItemMoney();

    public static final Item armSword = new ItemArmSword();

    public static final Item zebraBody = new ItemArmorZebraBody();

    public static final Item zebraBoots = new ItemArmorZebraBoots();

    public static final Item zebraHelmet = new ItemArmorZebraHelmet();

    public static final Item zebraLegs = new ItemArmorZebraLegs();

    public static final Item armyGem = new ItemArmyGem();

    public static final Item atom = new ItemAtom();

    public static final Item babyJarEmpty = new ItemBabyJarEmpty();

    public static final Item babyJarFull = new ItemBabyJarFull();

    public static final Item lolly = new ItemLolly();

    public static final Item gooDonut = new ItemGooDonut();

    public static final Item raygun = new ItemRaygun();

    public static final Item dev_raygun = new ItemDevRaygun();

    public static final Item evilEgg = new ItemEvilEgg();

    public static final Item earthGem = new ItemEarthGem();

    public static final Item miningGem = new ItemMiningGem();

    public static final Item skyGem = new ItemSkyGem();

    public static final Item healingGem = new ItemHealingGem();

    public static final Item fireGem = new ItemFireGem();

    public static final Item donut = new ItemDonut();

    public static final Item gemSword = new ItemGemSword();

    public static final Item frisbee = new ItemFrisbee();

    public static final Item shrinkRay = new ItemShrinkRay();

    public static final Item horseHeadGem = new ItemHorseHeadGem();

    public static final Item sundae = new ItemSundae();

    public static final Item shrinkShrink = new CreepsItem("shrinkshrink", true);

    public static final Item gun = new ItemGun();

    public static final Item extinguisher = new ItemExtinguisher();

    public static final Item rayRay = new CreepsItem("rayray", true);

    public static final Item dev_rayRay = new CreepsItem("dev_rayray", true);

    public static final Item rocket = new ItemRocket();

    public static final Item floobRaygun = new ItemRaygun("floob_raygun", true);

    public static final Item limbs = new ItemLimbs();

    public static final Item bulletBullet = new CreepsItem("bulletbullet", true);

    public static final Item smoke = new CreepsItem("smoke", true);

    public static final Item growRay = new ItemGrowRay();

    public static final Item zebraHide = new ItemZebraHide();

    public static final Item cavemanClub = new ItemCavemanClub();

    public static final Item growbotGrowRay = new ItemGrowRay("growbot_growray", true);

    public static final Item salGun = new ItemGun("sal_gun", true);

    public static final Item battery = new ItemBattery();

    public static final Item ram16k = new ItemRam16K();

    public static final Item mobilePhone = new ItemMobilePhone();

    public static final Item medicine = new ItemMedicine();

    public static final Item luckyDress = new ItemLuckyDress();

    public static final Item peeBucket = new ItemPeeBuck();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                peeBucket,
                guineaPigRadio,
                lifeGem,
                bandaid,
                popsicle,
                blorpCola,
                money,
                armSword,
                floobAchievement,
                goToHellAchievement,
                pigWhispererAchievement,
                zebraBody,
                zebraBoots,
                zebraHelmet,
                zebraLegs,
                armyGem,
                atom,
                babyJarEmpty,
                babyJarFull,
                lolly,
                gooDonut,
                raygun,
                dev_raygun,
                evilEgg,
                earthGem,
                miningGem,
                skyGem,
                healingGem,
                fireGem,
                donut,
                gemSword,
                frisbee,
                shrinkRay,
                horseHeadGem,
                sundae,
                shrinkShrink,
                gun,
                extinguisher,
                rayRay,
                dev_rayRay,
                rocket,
                smoke,
                floobRaygun,
                limbs,
                bulletBullet,
                growRay,
                zebraHide,
                cavemanClub,
                growbotGrowRay,
                salGun,
                battery,
                ram16k,
                mobilePhone,
                medicine,
                luckyDress
        );
    }

    @SideOnly(Side.CLIENT) @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        for (Item item : Item.REGISTRY)
        {
            if (item instanceof CreepsItem || item instanceof CreepsItemArmor || item instanceof CreepsItemFood || item instanceof CreepsItemSword)
            {
                ResourceLocation resourceLocation = item.getRegistryName();

                if (resourceLocation != null)
                {
                    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(resourceLocation, "inventory"));
                }
            }
        }
    }
}
