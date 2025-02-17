package UberBackendDevApp.CabBookingAppBackend.strategies;

import UberBackendDevApp.CabBookingAppBackend.dto.RideRequestDto;
import UberBackendDevApp.CabBookingAppBackend.entities.RideRequest;


public interface RideFareCalculationStrategy {
    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);
}
