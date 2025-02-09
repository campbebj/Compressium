package me.dinnerbeef.compressium.generators;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import me.dinnerbeef.compressium.Compressium;
import me.dinnerbeef.compressium.CompressiumType;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CompressiumLootTableProvider extends LootTableProvider {
    public CompressiumLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(CompressiumBlockLootTables::new, LootParameterSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((id, table) -> LootTableManager.validate(validationtracker, id, table));
    }

    private static class CompressiumBlockLootTables extends BlockLootTables {

        @Override
        protected void addTables() {
            for (CompressiumType type : CompressiumType.VALUES) {
                Stream.of(Compressium.BLOCKS.get(type.name)).forEach(this::dropSelf);
            }
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            List<Block> blocks = new ArrayList<>();
            for (CompressiumType type : CompressiumType.VALUES) {
                blocks.addAll(Arrays.asList(Compressium.BLOCKS.get(type.name)));
            }
            return blocks;
        }

    }
}
