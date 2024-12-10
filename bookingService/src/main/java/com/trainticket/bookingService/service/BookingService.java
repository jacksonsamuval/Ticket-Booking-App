package com.trainticket.bookingService.service;

import com.trainticket.bookingService.dto.PassengerDetails;
import com.trainticket.bookingService.dto.TrainDetails;
import com.trainticket.bookingService.entity.BookingDetails;
import com.trainticket.bookingService.feign.PassengerClient;
import com.trainticket.bookingService.feign.TrainClient;
import com.trainticket.bookingService.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private PassengerClient passengerClient;

    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private TrainClient trainClient;

    public BookingDetails bookTicket(BookingDetails bookingDetails) {
        PassengerDetails passenger = passengerClient.getPassengerById(bookingDetails.getPassengerId());
        TrainDetails trainDetails = trainClient.getTrainById(bookingDetails.getTrainId());

        if (passenger==null && trainDetails==null)
        {
            throw new RuntimeException("Invalid User Details");
        }
        bookingDetails.setStatus("CONFIRMED");
        return bookingRepo.save(bookingDetails);
    }
}
