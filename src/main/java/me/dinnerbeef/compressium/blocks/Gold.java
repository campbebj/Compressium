package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Gold extends Block {
    public Gold() {
        super(Properties.of(Material.METAL, MaterialColor.GOLD)
                      .sound(SoundType.METAL)
                      .strength(3.0f, 6.0f)
                      .harvestTool(ToolType.PICKAXE)
                      .requiresCorrectToolForDrops());
    }
}