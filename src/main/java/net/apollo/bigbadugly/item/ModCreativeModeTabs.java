package net.apollo.bigbadugly.item;

import net.apollo.bigbadugly.BigBadUgly;
import net.apollo.bigbadugly.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.guieffect.qual.PolyUIType;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BigBadUgly.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BIG_BAD_UGLY = CREATIVE_MODE_TABS.register("big_bad_and_ugly",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FOUL_BONE.get()))
                    .title(Component.translatable("creativetab.big_bad_and_ugly"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CRUDE_FOUL_BONE.get());
                        pOutput.accept(ModItems.FOUL_BONE_SHARD.get());
                        pOutput.accept(ModItems.FOUL_BONE.get());

                        pOutput.accept(ModItems.OGRE_BASHER.get());

                        pOutput.accept(ModItems.OGREBERRY.get());
                        pOutput.accept(ModItems.DRIED_OGREBERRY.get());

                        pOutput.accept(ModBlocks.BONE_LODGED_STONE.get());
                        pOutput.accept(ModBlocks.BONE_LODGED_DIRT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
