package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.RedstoneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Redstone extends RedstoneBlock {

    public Redstone() {
        super(Properties.of(Material.METAL, MaterialColor.FIRE)
                      .sound(SoundType.METAL)
                      .strength(5.0F, 6.0F)
                      .harvestTool(ToolType.PICKAXE));
    }
}

