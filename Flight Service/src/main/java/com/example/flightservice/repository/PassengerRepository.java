package com.example.flightservice.repository;

import com.example.flightservice.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<PassengerInfo, Long> {
}
