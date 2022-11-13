package com.alexm.flowerstoreforever.service;

import com.alexm.flowerstoreforever.item.flower.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
