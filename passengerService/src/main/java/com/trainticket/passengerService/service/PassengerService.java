package com.trainticket.passengerService.service;

import com.trainticket.passengerService.entity.PassengerDetails;
import com.trainticket.passengerService.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepo passengerRepo;

    public PassengerDetails saveData(PassengerDetails passengerDetails) {
        return passengerRepo.save(passengerDetails);
    }

    public List<PassengerDetails> getPassengers() {
        return passengerRepo.findAll();
    }

    public PassengerDetails getPassengerById(Long id) {
        return passengerRepo.fingById(id);
    }
}
