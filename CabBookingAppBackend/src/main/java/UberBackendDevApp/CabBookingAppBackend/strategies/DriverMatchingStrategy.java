package UberBackendDevApp.CabBookingAppBackend.strategies;

import UberBackendDevApp.CabBookingAppBackend.dto.RideRequestDto;
import UberBackendDevApp.CabBookingAppBackend.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findDrivers(RideRequestDto rideRequestDto);
}
