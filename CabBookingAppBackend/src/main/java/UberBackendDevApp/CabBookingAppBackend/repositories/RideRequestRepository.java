package UberBackendDevApp.CabBookingAppBackend.repositories;

import UberBackendDevApp.CabBookingAppBackend.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {


}
