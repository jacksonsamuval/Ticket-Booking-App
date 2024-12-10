package com.trainticket.bookingService.repository;

import com.trainticket.bookingService.dto.PassengerDetails;
import com.trainticket.bookingService.entity.BookingDetails;
import com.trainticket.bookingService.feign.PassengerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookingRepo {

    List<BookingDetails> bookingDetailsRepo = new ArrayList<>();

    public BookingDetails save(BookingDetails bookingDetails) {
        bookingDetailsRepo.add(bookingDetails);
        return bookingDetails;
    }
}
