package net.apollo.bigbadugly.datagen;

import net.apollo.bigbadugly.BigBadUgly;
import net.apollo.bigbadugly.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BigBadUgly.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CRUDE_FOUL_BONE);
        simpleItem(ModItems.FOUL_BONE_SHARD);
        simpleItem(ModItems.FOUL_BONE);

        simpleItem(ModItems.OGREBERRY);
        simpleItem(ModItems.DRIED_OGREBERRY);

        handHeldItem(ModItems.FOUL_BONE_PICKAXE);
        handHeldItem(ModItems.FOUL_BONE_SWORD);
        handHeldItem(ModItems.FOUL_BONE_AXE);
        handHeldItem(ModItems.FOUL_BONE_SHOVEL);

        handHeldItem(ModItems.OGRE_BONE_PLATE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BigBadUgly.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handHeldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BigBadUgly.MOD_ID,"item/" + item.getId().getPath()));
    }
}
