package me.dinnerbeef.compressium.generators;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import me.dinnerbeef.compressium.Compressium;
import me.dinnerbeef.compressium.CompressiumType;
<<<<<<< HEAD
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
=======
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
>>>>>>> Fixing merge issues

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
<<<<<<< HEAD
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return ImmutableList.of(
                Pair.of(CompressiumBlockLoot::new, LootContextParamSets.BLOCK)
=======
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(CompressiumBlockLootTables::new, LootParameterSets.BLOCK)
>>>>>>> Fixing merge issues
        );
    }

    @Override
<<<<<<< HEAD
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker) {
        map.forEach((id, table) -> LootTables.validate(validationtracker, id, table));
    }

    private static class CompressiumBlockLoot extends BlockLoot {
=======
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((id, table) -> LootTableManager.validate(validationtracker, id, table));
    }

    private static class CompressiumBlockLootTables extends BlockLootTables {
>>>>>>> Fixing merge issues

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
<<<<<<< HEAD
=======

>>>>>>> Fixing merge issues
    }
}
