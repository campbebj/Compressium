package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Quartz extends Block {
    public Quartz() {
        super(Properties.of(Material.STONE, MaterialColor.QUARTZ)
                      .strength(0.8F)
                      .harvestTool(ToolType.PICKAXE)
                      .requiresCorrectToolForDrops());
    }

}