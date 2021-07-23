package me.dinnerbeef.compressium.blocks;



import net.minecraft.world.level.block.HoneyBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class Honey extends HoneyBlock {
    public Honey() {
        super(Properties.of(Material.CLAY, MaterialColor.COLOR_ORANGE)
                      .speedFactor(0.4F)
                      .jumpFactor(0.5F)
                      .noOcclusion()
                      .sound(SoundType.HONEY_BLOCK));
    }
}

