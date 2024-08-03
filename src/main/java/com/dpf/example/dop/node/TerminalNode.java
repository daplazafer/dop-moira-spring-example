package com.dpf.example.dop.node;

import com.dpf.moira.Decision;
import com.dpf.moira.Node;
import com.dpf.moira.Scenario;
import com.dpf.example.dop.scenario.Car;
import com.dpf.example.dop.node.TerminalNode.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Decision(id = "end", description = "Finishing execution")
public class TerminalNode extends Node<Car, Result> {

    public enum Result {
    }

    @Override
    public Result execute(Scenario<Car> scenario) {
        log.info("[{}] Test finished, car is running below maximum speed", scenario.getExecutionId());
        return null;
    }
}
