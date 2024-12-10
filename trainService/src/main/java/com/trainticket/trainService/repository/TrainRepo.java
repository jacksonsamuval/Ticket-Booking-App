package com.trainticket.trainService.repository;

import com.trainticket.trainService.entity.TrainDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TrainRepo {

    List<TrainDetails> trainDetailsRepo = new ArrayList<>();
    public TrainDetails save(TrainDetails trainDetails) {
        trainDetailsRepo.add(trainDetails);
        return trainDetails;
    }

    public TrainDetails findById(Long id) {
        return trainDetailsRepo.stream()
                .filter(trainDetails -> trainDetails.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
