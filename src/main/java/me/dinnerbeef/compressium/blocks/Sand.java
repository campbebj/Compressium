package me.dinnerbeef.compressium.blocks;

import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Sand extends FallingBlock {
    public Sand() {
        super(Properties.of(Material.SAND, MaterialColor.SAND)
                      .sound(SoundType.SAND)
                      .strength(0.5f)
                      .harvestTool(ToolType.SHOVEL));
    }

    protected void falling(FallingBlockEntity fallingEntity) {
        fallingEntity.setHurtsEntities(1,1);
    }
}
