package com.dpf.example.dop.node;

import com.dpf.example.dop.scenario.Car;
import com.dpf.moira.Decision;
import com.dpf.moira.Node;
import com.dpf.moira.Scenario;
import com.dpf.example.respository.CarRepository;

import com.dpf.example.dop.node.IsCarOverMaximumSpeedNode.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.dpf.example.dop.node.IsCarOverMaximumSpeedNode.Result.NO;
import static com.dpf.example.dop.node.IsCarOverMaximumSpeedNode.Result.YES;

@Component
@Decision(id = "isCarOverMaximumSpeed", description = "Is the car over maximum speed?")
public class IsCarOverMaximumSpeedNode extends Node<Car, Result> {

    public enum Result {
        YES, NO
    }

    @Autowired
    private CarRepository carRepository;

    @Override
    public Result execute(Scenario<Car> scenario) {

        int maxSpeed = carRepository.getMaxSpeed();

        return scenario.get().getSpeed() > maxSpeed? YES: NO;
    }
}
