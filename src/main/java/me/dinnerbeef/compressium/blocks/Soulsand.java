package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.SoulSandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Soulsand extends SoulSandBlock {
    public Soulsand() {
        super(Properties.of(Material.DIRT, MaterialColor.COLOR_BROWN)
                      .strength(0.5F)
                      .sound(SoundType.SOUL_SAND)
                      .speedFactor(0.4f)
                      .harvestTool(ToolType.SHOVEL));

    }
}