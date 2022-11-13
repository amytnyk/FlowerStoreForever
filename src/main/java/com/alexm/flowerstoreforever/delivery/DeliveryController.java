package com.alexm.flowerstoreforever.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/delivery")
public class DeliveryController {
    @GetMapping
    public List<Delivery> strategies() {
        return List.of(new PostDeliveryStrategy(), new DHLDeliveryStrategy());
    }
}
