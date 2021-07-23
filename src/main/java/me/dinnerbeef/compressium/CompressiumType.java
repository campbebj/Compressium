package me.dinnerbeef.compressium;

import me.dinnerbeef.compressium.blocks.*;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author LatvianModder / DinnerBeef (Just Coped And Pasted Some Of This)
 */
public enum CompressiumType {
    COBBLESTONE("cobblestone", Cobblestone::new),
    STONE("stone", Stone::new),
    SAND("sand", Sand::new),
    GRAVEL("gravel", Gravel::new),
    NETHERRACK("netherrack", Netherrack::new),
    SNOW("snow", Snow::new),
    SOULSAND("soulsand", Soulsand::new),
    IRON("iron", Iron::new),
    GOLD("gold", Gold::new),
    DIAMOND("diamond", Diamond::new),
    EMERALD("emerald", Emerald::new),
    CLAY("clay", Clay::new),
    NETHERITE("netherite", Netherite::new),
    DIRT("dirt", Dirt::new),
    COAL("coal", Coal::new),
    REDSAND("redsand", RedSand::new),
    ENDSTONE("endstone", Endstone::new),
    OBSIDIAN("obsidian", Obsidian::new),
    LAPIS("lapis", Lapis::new),
    QUARTZ("quartz", Quartz::new),
    HONEY("honey", Honey::new),
    REDSTONE("redstone", Redstone::new),
    ANDESITE("andesite", Andesite::new),
    DIORITE("diorite", Diorite::new),
    GRANITE("granite", Granite::new);

    public static final CompressiumType[] VALUES = values();

    public final String name;
    public final Supplier<Block> factory;
    public final List<Block> blocks;

    CompressiumType(String n, Supplier<Block> f) {
        name = n;
        factory = f;
        blocks = new ArrayList<>();
    }
}