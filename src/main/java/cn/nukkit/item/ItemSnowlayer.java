package cn.nukkit.item;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockID;

public class ItemSnowlayer extends Item{
    public ItemSnowlayer() {
        this(0, 1);
    }

    public ItemSnowlayer(Integer meta) {
        this(meta, 1);
    }

    public ItemSnowlayer(Integer meta, int count) {
        super(SNOW_LAYER, meta, count, "Snow Layer");
        this.block = Block.get(BlockID.SNOW_LAYER);
    }


}
