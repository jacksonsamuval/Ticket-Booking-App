package com.trainticket.passengerService.repository;

import com.trainticket.passengerService.entity.PassengerDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PassengerRepo {

    List<PassengerDetails> passengerDetailsRepo = new ArrayList<>();

    public PassengerDetails save(PassengerDetails passengerDetails) {
        passengerDetailsRepo.add(passengerDetails);
        return passengerDetails;
    }

    public List<PassengerDetails> findAll()
    {
        return passengerDetailsRepo;
    }

    public PassengerDetails fingById(Long id) {
        return passengerDetailsRepo.stream()
                .filter(passengerDetails -> passengerDetails.getId() == id)
                .findFirst()
                .orElse(null);

    }
}
