package com.alexm.flowerstoreforever.item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<FlowerPack> packs = new ArrayList<>();

    public void addFlowers(FlowerPack flowerPack) {
        packs.add(flowerPack);
    }

    public double getPrice() {
        return packs.stream().mapToDouble(FlowerPack::getPrice).sum();
    }
}