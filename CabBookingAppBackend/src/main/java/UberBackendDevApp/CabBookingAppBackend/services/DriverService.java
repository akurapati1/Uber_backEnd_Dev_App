package UberBackendDevApp.CabBookingAppBackend.services;

import UberBackendDevApp.CabBookingAppBackend.dto.DriverDto;
import UberBackendDevApp.CabBookingAppBackend.dto.RideDto;
import UberBackendDevApp.CabBookingAppBackend.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();





}
