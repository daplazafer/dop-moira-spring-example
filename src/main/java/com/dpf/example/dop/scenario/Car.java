package com.dpf.example.dop.scenario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Car {

    private int speed;

    private int brakeForce;

    public void brake(){
        this.speed -= this.brakeForce;
    }

}
