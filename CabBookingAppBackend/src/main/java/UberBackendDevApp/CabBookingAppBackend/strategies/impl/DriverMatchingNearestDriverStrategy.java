package UberBackendDevApp.CabBookingAppBackend.strategies.impl;

import UberBackendDevApp.CabBookingAppBackend.entities.Driver;
import UberBackendDevApp.CabBookingAppBackend.entities.RideRequest;
import UberBackendDevApp.CabBookingAppBackend.repositories.DriverRepository;
import UberBackendDevApp.CabBookingAppBackend.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
