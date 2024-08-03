package com.dpf.example.dop.node;

import com.dpf.example.dop.scenario.Car;
import com.dpf.moira.Decision;
import com.dpf.moira.Node;
import com.dpf.moira.Scenario;
import com.dpf.example.dop.node.BrakeNode.Result;
import org.springframework.stereotype.Component;

import static com.dpf.example.dop.node.BrakeNode.Result.DONE;

@Component
@Decision(id = "brake", description = "Let's brake!")
public class BrakeNode extends Node<Car, Result> {

    public enum Result {
        DONE;
    }

    @Override
    public Result execute(Scenario<Car> scenario) {
        scenario.get().brake();
        return DONE;
    }
}
