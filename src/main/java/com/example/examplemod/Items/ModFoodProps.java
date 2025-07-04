package com.example.examplemod.Items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;


public class ModFoodProps {

    //This is the properties for our banana!
    public static final FoodProperties BANANA_FOOD = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(1.2F)
            .usingConvertsTo(() -> ModItems.BANANA_PEEL.get())
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0F)
            .alwaysEdible()
            .build();





}
