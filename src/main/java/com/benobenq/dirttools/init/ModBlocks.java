package com.benobenq.dirttools.init;

import com.benobenq.dirttools.block.BlockDT;
import com.benobenq.dirttools.block.BlockDirtSquare;
import com.benobenq.dirttools.reference.Names;
import com.benobenq.dirttools.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Bent on 18.07.2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockDT dirtSquare = new BlockDirtSquare();

    public static void init()
    {
        GameRegistry.registerBlock(dirtSquare, Names.Blocks.DIRT_SQUARE);
        //dirtSquare = (BlockDirtSquare)(new BlockDirtSquare().setUnlocalizedName("dirtSquare")
    }
}
