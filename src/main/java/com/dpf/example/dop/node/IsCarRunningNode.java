package com.dpf.example.dop.node;

import com.dpf.moira.Decision;
import com.dpf.moira.Node;
import com.dpf.moira.Scenario;
import com.dpf.example.dop.scenario.Car;

import com.dpf.example.dop.node.IsCarRunningNode.Result;
import org.springframework.stereotype.Component;

import static com.dpf.example.dop.node.IsCarRunningNode.Result.RUNNING;
import static com.dpf.example.dop.node.IsCarRunningNode.Result.STOPPED;

@Component
@Decision(id = "isCarRunning", description = "Is the car running?")
public class IsCarRunningNode extends Node<Car, Result> {

    public enum Result {
        RUNNING, STOPPED;
    }

    @Override
    public Result execute(Scenario<Car> scenario) {
        return scenario.get().getSpeed() > 0 ? RUNNING: STOPPED;
    }
}
