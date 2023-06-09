package com.example.airline_spring.services;

import com.example.airline_spring.models.Passenger;
import com.example.airline_spring.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    // Get all passengers
    public List<Passenger> getAllPassengers(){
        return passengerRepository.findAll();
    }

    // Add new passengers
    public Passenger addNewPassenger(Passenger newPassenger){
        return passengerRepository.save(newPassenger);
    }

    // Get specific passengers
    public Passenger getPassengerById(long id){
        return passengerRepository.findById(id).get();
    }






}
