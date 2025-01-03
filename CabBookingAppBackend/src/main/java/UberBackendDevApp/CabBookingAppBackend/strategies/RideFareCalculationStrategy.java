package UberBackendDevApp.CabBookingAppBackend.strategies;

import UberBackendDevApp.CabBookingAppBackend.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
