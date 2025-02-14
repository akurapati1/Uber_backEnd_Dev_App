package UberBackendDevApp.CabBookingAppBackend.strategies;

import UberBackendDevApp.CabBookingAppBackend.dto.RideRequestDto;
import UberBackendDevApp.CabBookingAppBackend.entities.RideRequest;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequest rideRequest);
}
