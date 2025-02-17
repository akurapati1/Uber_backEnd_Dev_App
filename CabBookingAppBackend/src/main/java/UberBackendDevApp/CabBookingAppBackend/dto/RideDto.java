package UberBackendDevApp.CabBookingAppBackend.dto;

import UberBackendDevApp.CabBookingAppBackend.entities.Driver;
import UberBackendDevApp.CabBookingAppBackend.entities.Rider;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.PaymentMethod;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;


    private PaymentMethod paymentmethod;

    private RideStatus rideStatus;

    private Double fare;

    private String otp;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;


}
