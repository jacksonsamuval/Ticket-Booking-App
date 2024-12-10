package com.trainticket.passengerService.controller;

import com.trainticket.passengerService.entity.PassengerDetails;
import com.trainticket.passengerService.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping
    public String greet() {
        return "good morning jackson";
    }

    @PostMapping("addPassenger")
    public PassengerDetails addPassenger(@RequestBody PassengerDetails passengerDetails)
    {
        return passengerService.saveData(passengerDetails);
    }

    @GetMapping("getPassengers")
    public List<PassengerDetails> getPassengers()
    {
        return passengerService.getPassengers();
    }

    @GetMapping("getPassengerById/{id}")
    public PassengerDetails getPassengerById(@PathVariable Long id)
    {
        return passengerService.getPassengerById(id);
    }
}
