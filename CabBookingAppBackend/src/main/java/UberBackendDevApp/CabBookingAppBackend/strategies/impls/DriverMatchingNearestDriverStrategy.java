package UberBackendDevApp.CabBookingAppBackend.strategies.impls;

import UberBackendDevApp.CabBookingAppBackend.dto.RideRequestDto;
import UberBackendDevApp.CabBookingAppBackend.entities.Driver;
import UberBackendDevApp.CabBookingAppBackend.entities.RideRequest;
import UberBackendDevApp.CabBookingAppBackend.repositories.DriverRepo;
import UberBackendDevApp.CabBookingAppBackend.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepo driverRepo;

    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {

        return driverRepo.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
