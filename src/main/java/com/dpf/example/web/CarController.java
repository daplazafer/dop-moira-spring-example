package com.dpf.example.web;

import com.dpf.moira.Moira;
import com.dpf.example.dop.scenario.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    public static final String CAR_WORKFLOW = "car";
    public static final int BRAKE_FORCE = 12;

    @Autowired
    private Moira moira;

    @GetMapping("/{speed}")
    @ResponseStatus(HttpStatus.OK)
    public String speed(@PathVariable int speed) {

        var car = new Car(speed, BRAKE_FORCE);
        moira.decideAsync(CAR_WORKFLOW, car);

        return "Running workflow...";
    }

}
