package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Dirt extends Block {
    public Dirt() {
        super(Properties.of(Material.DIRT, MaterialColor.DIRT)
                      .sound(SoundType.GRAVEL)
                      .strength(2.0f)
                      .harvestTool(ToolType.SHOVEL));
    }
}