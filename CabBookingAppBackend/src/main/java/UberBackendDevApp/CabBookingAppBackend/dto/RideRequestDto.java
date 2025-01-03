package UberBackendDevApp.CabBookingAppBackend.dto;

import UberBackendDevApp.CabBookingAppBackend.entities.Rider;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.PaymentMethod;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {

    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private Rider rider;

    private PaymentMethod paymentmethod;

    private RideRequestStatus rideRequestStatus;



}
