package net.apollo.bigbadugly.item;

import net.apollo.bigbadugly.BigBadUgly;
import net.apollo.bigbadugly.item.custom.FuelItem;
import net.apollo.bigbadugly.item.custom.ModArmorItem;
import net.apollo.bigbadugly.item.custom.ModToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BigBadUgly.MOD_ID);

    public static final RegistryObject<Item> CRUDE_FOUL_BONE = ITEMS.register("crude_foul_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOUL_BONE = ITEMS.register("foul_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOUL_BONE_SHARD = ITEMS.register("foul_bone_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OGREBERRY = ITEMS.register("ogreberry",
            () -> new Item(new Item.Properties().food(ModFoods.OGREBERRY)));
    public static final RegistryObject<Item> DRIED_OGREBERRY = ITEMS.register("dried_ogreberry",
            () -> new FuelItem(new Item.Properties(), 400));

    public static final RegistryObject<Item> OGRE_BASHER = ITEMS.register("ogre_basher",
            () -> new SwordItem(ModToolTiers.OGRE, 10, -3.5f, new Item.Properties()));
    public static final RegistryObject<Item> FOUL_BONE_SWORD = ITEMS.register("foul_bone_sword",
            () -> new SwordItem(ModToolTiers.OGRE, 4, -2.5f, new Item.Properties()));
   public static final RegistryObject<Item> FOUL_BONE_PICKAXE = ITEMS.register("foul_bone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OGRE, -2, -3f, new Item.Properties()));
   public static final RegistryObject<Item> FOUL_BONE_AXE = ITEMS.register("foul_bone_axe",
            () -> new AxeItem(ModToolTiers.OGRE, 5, -3f, new Item.Properties()));
   public static final RegistryObject<Item> FOUL_BONE_SHOVEL = ITEMS.register("foul_bone_shovel",
            () -> new ShovelItem(ModToolTiers.OGRE, -2, -3, new Item.Properties()));
   public static final RegistryObject<Item> OGRE_BONE_PLATE = ITEMS.register("ogre_bone_plate",
            () -> new ModArmorItem(ModArmorMaterials.OGRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
