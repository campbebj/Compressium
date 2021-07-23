package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Netherite extends Block {
    public Netherite() {
        super(Properties.of(Material.METAL, MaterialColor.COLOR_BLACK)
                      .strength(50.0F, 1200.0F)
                      .sound(SoundType.NETHERITE_BLOCK)
                      .harvestTool(ToolType.PICKAXE)
                      .requiresCorrectToolForDrops());
    }
}