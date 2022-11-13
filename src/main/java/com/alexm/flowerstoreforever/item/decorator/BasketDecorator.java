package com.alexm.flowerstoreforever.item.decorator;

import com.alexm.flowerstoreforever.item.Item;
import com.alexm.flowerstoreforever.item.ItemDecorator;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Flowers decorated by basket";
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}
