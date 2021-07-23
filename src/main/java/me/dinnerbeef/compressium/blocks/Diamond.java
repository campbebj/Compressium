package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

public class Diamond extends Block {
    public Diamond() {
        super(Properties.of(Material.METAL)
                      .sound(SoundType.METAL)
                      .strength(5.0f, 6.0f)
                      .harvestTool(ToolType.PICKAXE)
                      .requiresCorrectToolForDrops());
    }
}