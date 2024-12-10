package com.trainticket.bookingService.controller;

import com.trainticket.bookingService.entity.BookingDetails;
import com.trainticket.bookingService.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trainBooking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("bookTicket")
    public BookingDetails bookTicket(@RequestBody BookingDetails bookingDetails)
    {
        return bookingService.bookTicket(bookingDetails);
    }

}
