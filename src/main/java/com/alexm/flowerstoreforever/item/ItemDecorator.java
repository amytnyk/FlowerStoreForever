package com.alexm.flowerstoreforever.item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ItemDecorator extends Item {
    protected Item item;
}
