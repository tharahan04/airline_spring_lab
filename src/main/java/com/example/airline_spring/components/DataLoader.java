package com.example.airline_spring.components;

import com.example.airline_spring.models.Flight;
import com.example.airline_spring.models.Passenger;
import com.example.airline_spring.repositories.FlightRepository;
import com.example.airline_spring.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //Passengers
        Passenger passenger1 = new Passenger("Messi", "messi@gmail.com");
        passengerRepository.save(passenger1);

        Passenger passenger2 = new Passenger("Ronaldo", "ronaldo@gmail.com");
        passengerRepository.save(passenger2);

        Passenger passenger3 = new Passenger("Neymar", "neymar@gmail.com");
        passengerRepository.save(passenger3);

        Passenger passenger4 = new Passenger("Mbappe", "mbappe@gmail.com");
        passengerRepository.save(passenger4);

        Passenger passenger5 = new Passenger("Haaland", "haaland@gmail.com");
        passengerRepository.save(passenger5);


//       Flights
        Flight flight1 = new Flight("Argentina", 150, "20-04-2023", "1:00");
        flight1.addPassenger(passenger1);
        flightRepository.save(flight1);

        Flight flight2 = new Flight("Portugal", 150, "22-04-2023", "2:00");
        flight2.addPassenger(passenger1);
        flightRepository.save(flight2);

        Flight flight3 = new Flight("Brazil", 150, "01-05-2023", "3:00");
        flight3.addPassenger(passenger2);
        flightRepository.save(flight3);

        Flight flight4 = new Flight("France", 150, "15-06-2023", "04:00");
        flight4.addPassenger(passenger2);
        flightRepository.save(flight4);

        Flight flight5 = new Flight("Norway", 150, "21-07-2023", "5:00");
        flight5.addPassenger(passenger3);
        flightRepository.save(flight5);

    }
}
