package com.dpf.example.respository.impl;

import com.dpf.example.respository.CarRepository;
import org.springframework.stereotype.Component;

/**
 * This is fake repository
 */
@Component
public class CarRepositoryImpl implements CarRepository {

    @Override
    public int getMaxSpeed() {
        return 120;
    }

}
