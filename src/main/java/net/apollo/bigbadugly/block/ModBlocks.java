package net.apollo.bigbadugly.block;

import net.apollo.bigbadugly.BigBadUgly;
import net.apollo.bigbadugly.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BigBadUgly.MOD_ID);

    public static final RegistryObject<Block> BONE_LODGED_DIRT = registerBlock("bone_lodged_dirt",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).sound(SoundType.GRAVEL)
                    .requiresCorrectToolForDrops(), UniformInt.of(2,4)));

    public static final RegistryObject<Block> BONE_LODGED_STONE = registerBlock("bone_lodged_stone",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BASALT)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
