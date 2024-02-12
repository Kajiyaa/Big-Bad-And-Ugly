package net.apollo.bigbadugly.datagen;

import net.apollo.bigbadugly.BigBadUgly;
import net.apollo.bigbadugly.block.ModBlocks;
import net.apollo.bigbadugly.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BigBadUgly.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.IS_A_BLOCK)
                .add(ModBlocks.BONE_LODGED_STONE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.BONE_LODGED_DIRT.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BONE_LODGED_STONE.get()).addTag(Tags.Blocks.ORES);

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        this.tag(ModTags.Blocks.NEEDS_OGRE_TOOL);

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BONE_LODGED_STONE.get(),
                        ModBlocks.BONE_LODGED_DIRT.get()
                );

    }
}
