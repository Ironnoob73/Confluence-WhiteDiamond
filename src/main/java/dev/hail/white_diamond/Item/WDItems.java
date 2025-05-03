package dev.hail.white_diamond.Item;

import dev.hail.white_diamond.WhiteDiamondMod;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WDItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WhiteDiamondMod.MODID);
    public static final DeferredItem<Item> WHITE_DIAMOND = ITEMS.registerSimpleItem("white_diamond", new Item.Properties());
}
