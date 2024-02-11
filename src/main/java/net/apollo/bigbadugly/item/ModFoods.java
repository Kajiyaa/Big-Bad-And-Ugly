package net.apollo.bigbadugly.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties OGREBERRY = new FoodProperties.Builder().nutrition(2)
            .saturationMod(3).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 200), 0.1f).build();
}
