package UberBackendDevApp.CabBookingAppBackend.repositories;

import UberBackendDevApp.CabBookingAppBackend.entities.Driver;
import UberBackendDevApp.CabBookingAppBackend.entities.Rating;
import UberBackendDevApp.CabBookingAppBackend.entities.Ride;
import UberBackendDevApp.CabBookingAppBackend.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
