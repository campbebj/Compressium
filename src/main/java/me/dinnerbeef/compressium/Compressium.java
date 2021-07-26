package me.dinnerbeef.compressium;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("compressium")
public class Compressium {
    public static final CreativeModeTab creativeTab = new CreativeModeTab("compressium") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("compressium:cobblestone_1")));
        }
    };

    public Compressium() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addGenericListener(Block.class, this::registerBlocks);
        eventBus.addGenericListener(Item.class, this::registerItems);
        eventBus.addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        CompressiumClient.setupItemVar();
    }

    private void registerBlocks(RegistryEvent.Register<Block> event) {
        for (CompressiumType type : CompressiumType.VALUES) {
            for (int i = 0; i < 9; i++) {
                Block block = type.factory.get();
                event.getRegistry().register(block.setRegistryName(type.name + "_" + (i + 1)));
                type.blocks.add(block);
            }
        }
    }

    private void registerItems(RegistryEvent.Register<Item> event) {
        for (CompressiumType type : CompressiumType.VALUES) {
            for (Block block : type.blocks) {
                event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(creativeTab)).setRegistryName(block.getRegistryName()));
            }
        }
    }
}