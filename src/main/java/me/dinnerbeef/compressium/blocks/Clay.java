package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

public class Clay extends Block {
    public Clay() {
        super(Properties.of(Material.CLAY).sound(SoundType.GRAVEL)
                      .strength(0.6f)
                      .harvestTool(ToolType.SHOVEL));
    }
}

