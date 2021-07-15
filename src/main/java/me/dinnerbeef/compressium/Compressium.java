package me.dinnerbeef.compressium;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

@Mod(Compressium.MODID)
public class Compressium {
    public static final String MODID = "compressium";
    public static final Map<String, Block[]> BLOCKS = new HashMap<>();

    public static final ItemGroup creativeTab = new ItemGroup(Compressium.MODID) {
        @Override
       // @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("compressium:cobblestone_1")));
        }
    };

    public Compressium() {
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Block.class, this::registerBlocks);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, this::registerItems);

        DistExecutor.runForDist(() -> () -> new CompressiumClient(), () -> () -> new CompressiumCommon()).init();
    }

    private void registerBlocks(RegistryEvent.Register<Block> event) {
        for (CompressiumType type : CompressiumType.VALUES) {
            Block[] compressedList = new Block[9];
            BLOCKS.put(type.name, compressedList);
            for (int i = 0; i < 9; i++) {
                Block block = type.getBlock();
                event.getRegistry().register(block.setRegistryName(type.name + "_" + (i + 1)));
                compressedList[i] = block;
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