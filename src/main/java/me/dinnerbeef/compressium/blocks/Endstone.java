package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Endstone extends Block {
    public Endstone() {
        super(Properties.of(Material.STONE)
                      .sound(SoundType.STONE)
                      .strength(3.0f, 9.0f)
                      .harvestTool(ToolType.PICKAXE)
                      .requiresCorrectToolForDrops());
    }
}