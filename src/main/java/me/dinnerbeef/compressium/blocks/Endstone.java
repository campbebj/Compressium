package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
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