package UberBackendDevApp.CabBookingAppBackend.services;

import UberBackendDevApp.CabBookingAppBackend.dto.DriverDto;
import UberBackendDevApp.CabBookingAppBackend.dto.RideDto;
import UberBackendDevApp.CabBookingAppBackend.dto.RideRequestDto;
import UberBackendDevApp.CabBookingAppBackend.dto.RiderDto;
import UberBackendDevApp.CabBookingAppBackend.entities.Rider;
import UberBackendDevApp.CabBookingAppBackend.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

    Rider createNewRider(User user);
}
