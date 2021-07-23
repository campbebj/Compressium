package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Dirt extends Block {
    public Dirt() {
        super(Properties.of(Material.DIRT, MaterialColor.DIRT)
                      .sound(SoundType.GRAVEL)
                      .strength(2.0f)
                      .harvestTool(ToolType.SHOVEL));
    }
}