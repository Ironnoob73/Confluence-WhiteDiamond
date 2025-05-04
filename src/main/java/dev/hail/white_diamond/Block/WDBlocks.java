package dev.hail.white_diamond.Block;

import dev.hail.white_diamond.Item.WDItems;
import dev.hail.white_diamond.WhiteDiamondMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WDBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(WhiteDiamondMod.MODID);

    public static final DeferredBlock<Block> WHITE_DIAMOND_BLOCK = registerWithItem("white_diamond_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.SNOW), new Item.Properties());
    public static final DeferredBlock<Block> WHITE_DIAMOND_ORE = registerWithItem("white_diamond_ore",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.SNOW), new Item.Properties());
    public static final DeferredBlock<Block> DEEPSLATE_WHITE_DIAMOND_ORE = registerWithItem("deepslate_white_diamond_ore",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.SNOW), new Item.Properties());
    public static final DeferredBlock<Block> SANCTIFICATION_WHITE_DIAMOND_ORE = registerWithItem("sanctification_white_diamond_ore",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.SNOW), new Item.Properties());
    public static final DeferredBlock<Block> CORRUPTION_WHITE_DIAMOND_ORE = registerWithItem("corruption_white_diamond_ore",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.SNOW), new Item.Properties());
    public static final DeferredBlock<Block> FLESHIFICATION_WHITE_DIAMOND_ORE = registerWithItem("fleshification_white_diamond_ore",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.SNOW), new Item.Properties());

    public static DeferredBlock<Block> registerWithItem(String id, BlockBehaviour.Properties block, Item.Properties item) {
        DeferredBlock<Block> object = BLOCKS.register(id, () -> new Block(block));
        WDItems.ITEMS.registerSimpleBlockItem(object, item);
        return object;
    }
}
