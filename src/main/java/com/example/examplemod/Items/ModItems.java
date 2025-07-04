package com.example.examplemod.Items;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MODID);

    public static final DeferredItem<Item> BANANA_PEEL = ITEMS.register("banana_peel", () -> new BananaPeel(new Item.Properties()));
    public static final DeferredItem<Item> BANANA = ITEMS.register("banana", () -> new Item(new Item.Properties().food(ModFoodProps.BANANA_FOOD)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
