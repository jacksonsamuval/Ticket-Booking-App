package com.trainticket.bookingService.feign;

import com.trainticket.bookingService.dto.TrainDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("TRAINSERVICE")
public interface TrainClient {
    @GetMapping("/train/getById/{id}")
    public TrainDetails getTrainById(@PathVariable("id") Long id);
}
