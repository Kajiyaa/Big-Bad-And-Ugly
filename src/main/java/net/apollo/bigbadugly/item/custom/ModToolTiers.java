package net.apollo.bigbadugly.item.custom;

import net.apollo.bigbadugly.BigBadUgly;
import net.apollo.bigbadugly.item.ModItems;
import net.apollo.bigbadugly.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier OGRE = TierSortingRegistry.registerTier(
        new ForgeTier(5, 501, 1f, 6f, 25,
                ModTags.Blocks.NEEDS_OGRE_TOOL, () -> Ingredient.of(ModItems.FOUL_BONE.get())),
            new ResourceLocation(BigBadUgly.MOD_ID, "foul_bone"), List.of(Tiers.NETHERITE), List.of());
}

