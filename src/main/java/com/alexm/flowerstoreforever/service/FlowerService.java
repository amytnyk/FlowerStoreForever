package com.alexm.flowerstoreforever.service;

import com.alexm.flowerstoreforever.item.flower.Flower;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }

}