package UberBackendDevApp.CabBookingAppBackend.repositories;

import UberBackendDevApp.CabBookingAppBackend.entities.Payment;
import UberBackendDevApp.CabBookingAppBackend.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByRide(Ride ride);
}
