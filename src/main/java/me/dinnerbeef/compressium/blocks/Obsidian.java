package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Obsidian extends Block {
    public Obsidian() {
        super(Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
                      .strength(50.0f, 1200.0F)
                      .harvestTool(ToolType.PICKAXE)
                      .requiresCorrectToolForDrops());
    }
}