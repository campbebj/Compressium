package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Lapis extends Block {

    public Lapis() {
        super(Properties.of(Material.METAL)
                      .sound(SoundType.METAL)
                      .strength(3.0F, 3.0F)
                      .harvestTool(ToolType.PICKAXE));
    }
}

