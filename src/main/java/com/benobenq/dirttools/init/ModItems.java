package com.benobenq.dirttools.init;

import com.benobenq.dirttools.item.ItemDT;
import com.benobenq.dirttools.item.ItemDirtChestplate;
import com.benobenq.dirttools.reference.Names;
import com.benobenq.dirttools.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemDT dirtChestplate = new ItemDirtChestplate();



    public static void init()
    {
        GameRegistry.registerItem(dirtChestplate,Names.Items.DIRT_CHESTPLATE);
    }
}
