package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Clay extends Block {
    public Clay() {
        super(Properties.of(Material.CLAY).sound(SoundType.GRAVEL)
                      .strength(0.6f)
                      .harvestTool(ToolType.SHOVEL));
    }
}

