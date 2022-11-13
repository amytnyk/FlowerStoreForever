package com.alexm.flowerstoreforever;

import com.alexm.flowerstoreforever.delivery.Delivery;
import com.alexm.flowerstoreforever.item.Item;
import com.alexm.flowerstoreforever.payment.Payment;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items = new ArrayList<>();
    @Setter
    public Payment payment;
    @Setter
    public Delivery delivery;

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void processOrder() {
        if (payment.pay(calculateTotalPrice()))
            delivery.deliver(items);
    }
}
