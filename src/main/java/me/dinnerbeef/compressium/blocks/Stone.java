package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Stone extends Block {
    public Stone() {
        super(Properties.of(Material.STONE)
                      .sound(SoundType.STONE)
                      .strength(1.5f, 6.0f)
                      .harvestTool(ToolType.PICKAXE)
                      .requiresCorrectToolForDrops());
    }
}