package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.SoulSandBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
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