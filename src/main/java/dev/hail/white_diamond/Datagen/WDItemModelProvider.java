package dev.hail.white_diamond.Datagen;

import dev.hail.white_diamond.Item.WDItems;
import dev.hail.white_diamond.WhiteDiamondMod;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class WDItemModelProvider extends ItemModelProvider {
    ResourceLocation gItemModel = ResourceLocation.withDefaultNamespace("item/generated");
    public WDItemModelProvider(PackOutput gen, ExistingFileHelper helper) {
        super(gen, WhiteDiamondMod.MODID, helper);
    }
    @Override
    protected void registerModels() {
        genDefault(WDItems.WHITE_DIAMOND);
    }
    private void genDefault(DeferredItem<Item> item){
        singleTexture(item.getId().getPath(), gItemModel, "layer0",
                WhiteDiamondMod.modResLocation("item/" + item.getId().getPath()));
    }
    private void genBlockItem(DeferredItem<Item> item){
        singleTexture(item.getId().getPath(), gItemModel, "layer0",
                WhiteDiamondMod.modResLocation("block/" + item.getId().getPath()));
    }
    private void genBlockItemWithModel(DeferredItem<Item> item){
        withExistingParent(item.getId().getPath(), WhiteDiamondMod.modResLocation("block/" + item.getId().getPath()));
    }
}