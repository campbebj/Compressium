package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class RedSand extends FallingBlock {
    public RedSand() {
        super(Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
                      .sound(SoundType.SAND)
                      .strength(0.5f)
                      .harvestTool(ToolType.SHOVEL));
    }

    protected void falling(FallingBlockEntity fallingEntity) {
        fallingEntity.setHurtsEntities(1f,20);
    }
}
