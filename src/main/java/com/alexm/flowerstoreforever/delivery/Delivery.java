package com.alexm.flowerstoreforever.delivery;

import com.alexm.flowerstoreforever.item.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}
