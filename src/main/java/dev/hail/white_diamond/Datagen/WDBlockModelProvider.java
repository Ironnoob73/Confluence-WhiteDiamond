package dev.hail.white_diamond.Datagen;

import dev.hail.white_diamond.Block.WDBlocks;
import dev.hail.white_diamond.WhiteDiamondMod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class WDBlockModelProvider extends BlockStateProvider {
    public WDBlockModelProvider(PackOutput gen, ExistingFileHelper helper) {
        super(gen, WhiteDiamondMod.MODID, helper);
    }
    @Override
    protected void registerStatesAndModels() {
        genCubeAllBlockWithItem(WDBlocks.WHITE_DIAMOND_BLOCK);
        genCubeAllBlockWithItem(WDBlocks.WHITE_DIAMOND_ORE);
        genCubeAllBlockWithItem(WDBlocks.DEEPSLATE_WHITE_DIAMOND_ORE);
        genCubeAllBlockWithItem(WDBlocks.SANCTIFICATION_WHITE_DIAMOND_ORE);
        genCubeAllBlockWithItem(WDBlocks.CORRUPTION_WHITE_DIAMOND_ORE);
        genCubeAllBlockWithItem(WDBlocks.FLESHIFICATION_WHITE_DIAMOND_ORE);
    }
    protected void genCubeAllBlockWithItem(DeferredBlock<Block> block){
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}