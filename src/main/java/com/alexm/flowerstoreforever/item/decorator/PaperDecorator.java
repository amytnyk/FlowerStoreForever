package com.alexm.flowerstoreforever.item.decorator;

import com.alexm.flowerstoreforever.item.Item;
import com.alexm.flowerstoreforever.item.ItemDecorator;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Flowers decorated by paper";
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}