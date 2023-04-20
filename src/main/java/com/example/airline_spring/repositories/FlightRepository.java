package com.example.airline_spring.repositories;

import com.example.airline_spring.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findFlightByDestination(String destination);

}
