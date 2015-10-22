package com.benobenq.dirttools.block;

import com.benobenq.dirttools.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;

/**
 * Created by Bent on 18.07.2015.
 */
public class BlockDirtSquare extends BlockDT {
     public BlockDirtSquare() {
        super(Material.grass);
         this.setBlockName(Names.Blocks.DIRT_SQUARE);
         this.isFullSize = this.isOpaque = false;
    }

    /*@Override

    public int getRenderType() {
        return 2;
    }*/

    public boolean renderAsNormalBlock() {
        return false;
    }
}
