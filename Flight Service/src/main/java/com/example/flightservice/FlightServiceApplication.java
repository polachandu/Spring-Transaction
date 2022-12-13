package com.example.flightservice;

import com.example.flightservice.dto.FlightBookingAcknowledgment;
import com.example.flightservice.dto.FlightBookingRequest;
import com.example.flightservice.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class FlightServiceApplication {

    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("/bookflightticket")
    public FlightBookingAcknowledgment bookingAcknowledgment(@RequestBody FlightBookingRequest flightBookingRequest){
        return flightBookingService.flightBookingAcknowledgment(flightBookingRequest);
    }
    public static void main(String[] args) {
        SpringApplication.run(FlightServiceApplication.class, args);
    }

}
