package me.dinnerbeef.compressium.blocks;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

public class Snow extends Block {
    public Snow() {
        super(Properties.of(Material.SNOW)
                      .sound(SoundType.SNOW)
                      .strength(0.2f)
                      .harvestTool(ToolType.SHOVEL)
                      .harvestTool(ToolType.SHOVEL));
    }
}