package com.alexm.flowerstoreforever.item;

import com.alexm.flowerstoreforever.item.flower.Flower;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerPack extends Item {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower) {
        this(flower, 1);
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}

