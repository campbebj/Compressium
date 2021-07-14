package me.dinnerbeef.compressium;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.item.FallingBlockEntity;

public class FallingDamageBlock extends FallingBlock {
    public FallingDamageBlock(AbstractBlock.Properties properties) {
        super(properties);
    }

    protected void falling(FallingBlockEntity fallingEntity) {
        fallingEntity.setHurtsEntities(true);
    }
}