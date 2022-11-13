package com.alexm.flowerstoreforever.delivery;

import com.alexm.flowerstoreforever.item.Item;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        // Some delivering process
    }

    @Override
    public String toString() {
        return "DHLDeliveryStrategy";
    }
}
