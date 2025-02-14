package UberBackendDevApp.CabBookingAppBackend.strategies.impls;

import UberBackendDevApp.CabBookingAppBackend.dto.RideRequestDto;
import UberBackendDevApp.CabBookingAppBackend.entities.RideRequest;
import UberBackendDevApp.CabBookingAppBackend.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class DefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
