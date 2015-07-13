package com.benobenq.dirttools.CreativeTab;

import com.benobenq.dirttools.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDT {

    public static final CreativeTabs DT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemById(45);
        }
        @Override
        public String getTranslatedTabLabel() {
            return "Dirt Tools";
        }


    };
}
