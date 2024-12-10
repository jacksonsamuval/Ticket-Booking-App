package com.trainticket.trainService.controller;

import com.trainticket.trainService.entity.TrainDetails;
import com.trainticket.trainService.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("train")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @PostMapping("addTrain")
    public TrainDetails addTrain(@RequestBody TrainDetails trainDetails)
    {
        return trainService.addTrain(trainDetails);
    }

    @GetMapping("getById/{id}")
    public TrainDetails getTrainById(@PathVariable Long id)
    {
        return trainService.getTrainById(id);
    }
}
