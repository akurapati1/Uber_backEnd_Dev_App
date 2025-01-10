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
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;

    private PointDto pickupLocation;
    private PointDto dropOffLocation;
    private PaymentMethod paymentMethod;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private RideRequestStatus rideRequestStatus;
}

