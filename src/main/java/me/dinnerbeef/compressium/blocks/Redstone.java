package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.level.block.PoweredBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Redstone extends PoweredBlock {

    public Redstone() {
        super(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.FIRE)
                      .sound(SoundType.METAL)
                      .strength(5.0F, 6.0F)
                      .harvestTool(ToolType.PICKAXE));
    }
}

