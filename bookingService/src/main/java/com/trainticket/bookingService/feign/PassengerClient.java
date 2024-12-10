package com.trainticket.bookingService.feign;

import com.trainticket.bookingService.dto.PassengerDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("PASSENGERSERVICE")
public interface PassengerClient {
    @GetMapping("/passenger/getPassengerById/{id}")
    public PassengerDetails getPassengerById(@PathVariable("id") Long id);
}
