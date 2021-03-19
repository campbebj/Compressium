package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Coal extends Block {
    public Coal() {
        super(Properties.create(Material.ROCK, MaterialColor.BLACK)
                      .hardnessAndResistance(5.0f, 6.0f)
                      .harvestTool(ToolType.PICKAXE)
                      .setRequiresTool());
    }
}