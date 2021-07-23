package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;


public class Granite extends Block {
    public Granite() {
        super(Properties.of(Material.STONE)
                      .sound(SoundType.STONE)
                      .strength(2.0f, 6.0F)
                      .harvestTool(ToolType.PICKAXE)
                      .requiresCorrectToolForDrops());
    }
}
