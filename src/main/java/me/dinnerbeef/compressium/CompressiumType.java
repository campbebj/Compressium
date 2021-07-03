package me.dinnerbeef.compressium;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LatvianModder / DinnerBeef (Just Coped And Pasted Some Of This)
 */
public enum CompressiumType {
<<<<<<< Updated upstream
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
=======
    TERRACOTTA("terracotta", new ResourceLocation("minecraft", "terracotta"),
            new ResourceLocation("minecraft", "block/terracotta"), new ResourceLocation("minecraft","block/terracotta")),
    COBBLESTONE("cobblestone", new ResourceLocation("minecraft", "cobblestone"),
            new ResourceLocation("minecraft", "block/cobblestone"), new ResourceLocation("minecraft","block/cobblestone")),
    STONE("stone", new ResourceLocation("minecraft", "stone"),
            new ResourceLocation("minecraft", "block/stone"), new ResourceLocation("minecraft","block/stone")),
    SAND("sand", new ResourceLocation("minecraft", "sand"),
            new ResourceLocation("minecraft", "block/sand"), new ResourceLocation("minecraft","block/sand")),
    GRAVEL("gravel", new ResourceLocation("minecraft", "gravel"),
            new ResourceLocation("minecraft", "block/gravel"), new ResourceLocation("minecraft","block/gravel")),
    NETHERRACK("netherrack", new ResourceLocation("minecraft", "netherrack"),
            new ResourceLocation("minecraft", "block/netherrack"), new ResourceLocation("minecraft","block/netherrack")),
    SNOW("snow", new ResourceLocation("minecraft", "snow"),
            new ResourceLocation("minecraft", "block/snow"), new ResourceLocation("minecraft","block/snow_block")),
    SOULSAND("soulsand", new ResourceLocation("minecraft", "soul_sand"),
            new ResourceLocation("minecraft", "block/soul_sand"), new ResourceLocation("minecraft","block/soul_sand")),
    IRON("iron", new ResourceLocation("minecraft", "iron_block"),
            new ResourceLocation("minecraft", "block/iron_block"), new ResourceLocation("minecraft","block/iron_block")),
    GOLD("gold", new ResourceLocation("minecraft", "gold_block"),
            new ResourceLocation("minecraft", "block/gold_block"), new ResourceLocation("minecraft","block/gold_block")),
    DIAMOND("diamond", new ResourceLocation("minecraft", "diamond_block"),
            new ResourceLocation("minecraft", "block/diamond_block"), new ResourceLocation("minecraft","block/diamond_block")),
    EMERALD("emerald", new ResourceLocation("minecraft", "emerald_block"),
            new ResourceLocation("minecraft", "block/emerald_block"), new ResourceLocation("minecraft","block/emerald_block")),
    CLAY("clay", new ResourceLocation("minecraft", "clay"),
            new ResourceLocation("minecraft", "block/clay"), new ResourceLocation("minecraft","block/clay")),
    NETHERITE("netherite", new ResourceLocation("minecraft", "netherite_block"),
            new ResourceLocation("minecraft", "block/netherite_block"), new ResourceLocation("minecraft","block/netherite_block")),
    DIRT("dirt", new ResourceLocation("minecraft", "dirt"),
            new ResourceLocation("minecraft", "block/dirt"), new ResourceLocation("minecraft","block/dirt")),
    COAL("coal", new ResourceLocation("minecraft", "coal_block"),
            new ResourceLocation("minecraft", "block/coal_block"), new ResourceLocation("minecraft","block/coal_block")),
    REDSAND("redsand", new ResourceLocation("minecraft", "red_sand"),
            new ResourceLocation("minecraft", "block/red_sand"), new ResourceLocation("minecraft","block/red_sand")),
    ENDSTONE("endstone", new ResourceLocation("minecraft", "end_stone"),
            new ResourceLocation("minecraft", "block/end_stone"), new ResourceLocation("minecraft","block/end_stone")),
    OBSIDIAN("obsidian", new ResourceLocation("minecraft", "obsidian"),
            new ResourceLocation("minecraft", "block/obsidian"), new ResourceLocation("minecraft","block/obsidian")),
    LAPIS("lapis", new ResourceLocation("minecraft", "lapis_block"),
            new ResourceLocation("minecraft", "block/lapis_block"), new ResourceLocation("minecraft","block/lapis_block")),
    QUARTZ("quartz", new ResourceLocation("minecraft", "quartz_block"),
            new ResourceLocation("minecraft", "block/quartz_block_side"), new ResourceLocation("minecraft","block/quartz_block")),
    HONEY("honey", new ResourceLocation("minecraft", "honey_block"),
            new ResourceLocation("minecraft", "block/honey_block_side"), new ResourceLocation("minecraft","block/honey_block")),
    REDSTONE("redstone", new ResourceLocation("minecraft", "redstone_block"),
            new ResourceLocation("minecraft", "block/redstone_block"), new ResourceLocation("minecraft","block/redstone_block")),
    ANDESITE("andesite", new ResourceLocation("minecraft", "andesite"),
            new ResourceLocation("minecraft", "block/andesite"), new ResourceLocation("minecraft","block/andesite")),
    DIORITE("diorite", new ResourceLocation("minecraft", "diorite"),
            new ResourceLocation("minecraft", "block/diorite"), new ResourceLocation("minecraft","block/diorite")),
    GRANITE("granite", new ResourceLocation("minecraft", "granite"),
            new ResourceLocation("minecraft", "block/granite"), new ResourceLocation("minecraft","block/granite")),
    BASALT("basalt", new ResourceLocation("minecraft", "basalt"),
            new ResourceLocation("minecraft", "block/basalt_side"), new ResourceLocation("minecraft","block/basalt")),
    BLACKSTONE("blackstone", new ResourceLocation("minecraft", "blackstone"),
            new ResourceLocation("minecraft", "block/blackstone"), new ResourceLocation("minecraft","block/blackstone")),
    MAGMABLOCK("magmablock", new ResourceLocation("minecraft", "magma_block"),
            new ResourceLocation("minecraft", "block/magma"), new ResourceLocation("minecraft","block/magma_block")),
    NETHERBRICKS("netherbricks", new ResourceLocation("minecraft", "nether_bricks"),
            new ResourceLocation("minecraft", "block/nether_bricks"), new ResourceLocation("minecraft","block/nether_bricks")),
    SOULSOIL("soulsoil", new ResourceLocation("minecraft", "soul_soil"),
            new ResourceLocation("minecraft", "block/soul_soil"), new ResourceLocation("minecraft","block/soul_soil")),
    BONEBLOCK("boneblock", new ResourceLocation("minecraft", "bone_block"),
            new ResourceLocation("minecraft", "block/bone_block_side"), new ResourceLocation("minecraft","block/bone_block")),
    CRYINGOBSIDIAN("cryingobsidian", new ResourceLocation("minecraft", "crying_obsidian"),
            new ResourceLocation("minecraft", "block/crying_obsidian"), new ResourceLocation("minecraft","block/crying_obsidian")),
    KELPBLOCK("kelpblock", new ResourceLocation("minecraft", "dried_kelp_block"),
            new ResourceLocation("minecraft", "block/dried_kelp_side"), new ResourceLocation("minecraft","block/dried_kelp_block"));
>>>>>>> Stashed changes

    public static final CompressiumType[] VALUES = values();

    public final String name;
    public final ResourceLocation baseResourceLocation;
    public final List<Block> blocks;
    public final ResourceLocation particlePath;
    public final ResourceLocation baseBlockModel;

    CompressiumType(String n, ResourceLocation baseResourceLocation,
                    ResourceLocation particlePath, ResourceLocation baseBlockModel) {
        this.name = n;
        this.blocks = new ArrayList<>();
        this.particlePath = particlePath;
        this.baseBlockModel = baseBlockModel;
        this.baseResourceLocation = baseResourceLocation;
    }

    public Block getBaseBlock() {
        return ForgeRegistries.BLOCKS.getValue(baseResourceLocation);
    }

    public Block getBlock() {
        return new Block(AbstractBlock.Properties.copy(ForgeRegistries.BLOCKS.getValue(baseResourceLocation)));
    }
}