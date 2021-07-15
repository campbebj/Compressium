package me.dinnerbeef.compressium;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.NetherrackBlock;
import net.minecraft.world.level.block.PoweredBlock;
import net.minecraft.world.level.block.SoulSandBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public enum CompressiumType {
    COBBLESTONE("cobblestone",
            new ResourceLocation("minecraft", "cobblestone"),
            new ResourceLocation("minecraft", "block/cobblestone"),
            new ResourceLocation("minecraft","block/cobblestone"),
            Block::new),
    STONE("stone",
            new ResourceLocation("minecraft", "stone"),
            new ResourceLocation("minecraft", "block/stone"),
            new ResourceLocation("minecraft","block/stone"),
            Block::new),
    SAND("sand",
            new ResourceLocation("minecraft", "sand"),
            new ResourceLocation("minecraft", "block/sand"),
            new ResourceLocation("minecraft","block/sand"),
            FallingDamageBlock::new),
    GRAVEL("gravel",
            new ResourceLocation("minecraft", "gravel"),
            new ResourceLocation("minecraft", "block/gravel"),
            new ResourceLocation("minecraft","block/gravel"),
            FallingDamageBlock::new),
    NETHERRACK("netherrack",
            new ResourceLocation("minecraft", "netherrack"),
            new ResourceLocation("minecraft", "block/netherrack"),
            new ResourceLocation("minecraft","block/netherrack"),
            NetherrackBlock::new),
    SNOW("snow",
            new ResourceLocation("minecraft", "snow"),
            new ResourceLocation("minecraft", "block/snow"),
            new ResourceLocation("minecraft","block/snow_block"),
            Block::new),
    SOULSAND("soulsand",
            new ResourceLocation("minecraft", "soul_sand"),
            new ResourceLocation("minecraft", "block/soul_sand"),
            new ResourceLocation("minecraft","block/soul_sand"),
            SoulSandBlock::new),
    IRON("iron",
            new ResourceLocation("minecraft", "iron_block"),
            new ResourceLocation("minecraft", "block/iron_block"),
            new ResourceLocation("minecraft","block/iron_block"),
            Block::new),
    GOLD("gold",
            new ResourceLocation("minecraft", "gold_block"),
            new ResourceLocation("minecraft", "block/gold_block"),
            new ResourceLocation("minecraft","block/gold_block"),
            Block::new),
    DIAMOND("diamond",
            new ResourceLocation("minecraft", "diamond_block"),
            new ResourceLocation("minecraft", "block/diamond_block"),
            new ResourceLocation("minecraft","block/diamond_block"),
            Block::new),
    EMERALD("emerald",
            new ResourceLocation("minecraft", "emerald_block"),
            new ResourceLocation("minecraft", "block/emerald_block"),
            new ResourceLocation("minecraft","block/emerald_block"),
            Block::new),
    CLAY("clay",
            new ResourceLocation("minecraft", "clay"),
            new ResourceLocation("minecraft", "block/clay"),
            new ResourceLocation("minecraft","block/clay"),
            Block::new),
    NETHERITE("netherite",
            new ResourceLocation("minecraft", "netherite_block"),
            new ResourceLocation("minecraft", "block/netherite_block"),
            new ResourceLocation("minecraft","block/netherite_block"),
            Block::new),
    DIRT("dirt",
            new ResourceLocation("minecraft", "dirt"),
            new ResourceLocation("minecraft", "block/dirt"),
            new ResourceLocation("minecraft","block/dirt"),
            Block::new),
    COAL("coal",
            new ResourceLocation("minecraft", "coal_block"),
            new ResourceLocation("minecraft", "block/coal_block"),
            new ResourceLocation("minecraft","block/coal_block"),
            Block::new),
    REDSAND("redsand",
            new ResourceLocation("minecraft", "red_sand"),
            new ResourceLocation("minecraft", "block/red_sand"),
            new ResourceLocation("minecraft","block/red_sand"),
            FallingDamageBlock::new),
    ENDSTONE("endstone",
            new ResourceLocation("minecraft", "end_stone"),
            new ResourceLocation("minecraft", "block/end_stone"),
            new ResourceLocation("minecraft","block/end_stone"),
            Block::new),
    OBSIDIAN("obsidian",
            new ResourceLocation("minecraft", "obsidian"),
            new ResourceLocation("minecraft", "block/obsidian"),
            new ResourceLocation("minecraft","block/obsidian"),
            Block::new),
    LAPIS("lapis",
            new ResourceLocation("minecraft", "lapis_block"),
            new ResourceLocation("minecraft", "block/lapis_block"),
            new ResourceLocation("minecraft","block/lapis_block"),
            Block::new),
    QUARTZ("quartz",
            new ResourceLocation("minecraft", "quartz_block"),
            new ResourceLocation("minecraft", "block/quartz_block_side"),
            new ResourceLocation("minecraft","block/quartz_block"),
            Block::new),
    REDSTONE("redstone",
            new ResourceLocation("minecraft", "redstone_block"),
            new ResourceLocation("minecraft", "block/redstone_block"),
            new ResourceLocation("minecraft","block/redstone_block"),
            PoweredBlock::new),
    ANDESITE("andesite",
            new ResourceLocation("minecraft", "andesite"),
            new ResourceLocation("minecraft", "block/andesite"),
            new ResourceLocation("minecraft","block/andesite"),
            Block::new),
    DIORITE("diorite",
            new ResourceLocation("minecraft", "diorite"),
            new ResourceLocation("minecraft", "block/diorite"),
            new ResourceLocation("minecraft","block/diorite"),
            Block::new),
    GRANITE("granite",
            new ResourceLocation("minecraft", "granite"),
            new ResourceLocation("minecraft", "block/granite"),
            new ResourceLocation("minecraft","block/granite"),
<<<<<<< HEAD
=======
            Block::new),
    BASALT("basalt",
            new ResourceLocation("minecraft", "basalt"),
            new ResourceLocation("minecraft", "block/basalt_side"),
            new ResourceLocation("minecraft","block/basalt"),
            Block::new),
    BLACKSTONE("blackstone",
            new ResourceLocation("minecraft", "blackstone"),
            new ResourceLocation("minecraft", "block/blackstone"),
            new ResourceLocation("minecraft","block/blackstone"),
            Block::new),
    MAGMABLOCK("magmablock",
            new ResourceLocation("minecraft", "magma_block"),
            new ResourceLocation("minecraft", "block/magma"),
            new ResourceLocation("minecraft","block/magma_block"),
            MagmaBlock::new),
    NETHERBRICKS("netherbricks",
            new ResourceLocation("minecraft", "nether_bricks"),
            new ResourceLocation("minecraft", "block/nether_bricks"),
            new ResourceLocation("minecraft","block/nether_bricks"),
            Block::new),
    SOULSOIL("soulsoil",
            new ResourceLocation("minecraft", "soul_soil"),
            new ResourceLocation("minecraft", "block/soul_soil"),
            new ResourceLocation("minecraft","block/soul_soil"),
            Block::new),
    BONEBLOCK("boneblock",
            new ResourceLocation("minecraft", "bone_block"),
            new ResourceLocation("minecraft", "block/bone_block_side"),
            new ResourceLocation("minecraft","block/bone_block"),
            Block::new),
    CRYINGOBSIDIAN("cryingobsidian",
            new ResourceLocation("minecraft", "crying_obsidian"),
            new ResourceLocation("minecraft", "block/crying_obsidian"),
            new ResourceLocation("minecraft","block/crying_obsidian"),
            Block::new),
    KELPBLOCK("kelpblock",
            new ResourceLocation("minecraft", "dried_kelp_block"),
            new ResourceLocation("minecraft", "block/dried_kelp_side"),
            new ResourceLocation("minecraft","block/dried_kelp_block"),
            Block::new),
    PRISMARINE("prismarine",
            new ResourceLocation("minecraft", "prismarine"),
            new ResourceLocation("minecraft", "block/prismarine"),
            new ResourceLocation("minecraft","block/prismarine"),
            Block::new),
    PRISMARINEBRICKS("prismarinebricks",
            new ResourceLocation("minecraft", "prismarine_bricks"),
            new ResourceLocation("minecraft", "block/prismarine_bricks"),
            new ResourceLocation("minecraft","block/prismarine_bricks"),
            Block::new),
    DARKPRISMARINE("darkprismarine",
            new ResourceLocation("minecraft", "dark_prismarine"),
            new ResourceLocation("minecraft", "block/dark_prismarine"),
            new ResourceLocation("minecraft","block/dark_prismarine"),
>>>>>>> Fixing merge issues
            Block::new);

    public static final CompressiumType[] VALUES = values();

    public final String name;
    public final ResourceLocation baseResourceLocation;
    public final List<Block> blocks;
    public final ResourceLocation particlePath;
    public final ResourceLocation baseBlockModel;
    private final Function<BlockBehaviour.Properties, Block> constructor;

    CompressiumType(String n, ResourceLocation baseResourceLocation,
                    ResourceLocation particlePath, ResourceLocation baseBlockModel,
                    Function<BlockBehaviour.Properties, Block> constructor) {
        this.name = n;
        this.blocks = new ArrayList<>();
        this.particlePath = particlePath;
        this.baseBlockModel = baseBlockModel;
        this.baseResourceLocation = baseResourceLocation;
        this.constructor = constructor;
    }

    public Block getBaseBlock() {
        return ForgeRegistries.BLOCKS.getValue(baseResourceLocation);
    }

    public Block getBlock() {
        return constructor.apply(BlockBehaviour.Properties.copy(ForgeRegistries.BLOCKS.getValue(baseResourceLocation)));
    }
}