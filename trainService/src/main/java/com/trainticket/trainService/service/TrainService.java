package com.trainticket.trainService.service;

import com.trainticket.trainService.entity.TrainDetails;
import com.trainticket.trainService.repository.TrainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {

    @Autowired
    private TrainRepo trainRepo;

    public TrainDetails addTrain(TrainDetails trainDetails) {
        return trainRepo.save(trainDetails);
    }

    public TrainDetails getTrainById(Long id) {
        return trainRepo.findById(id);
    }
}
