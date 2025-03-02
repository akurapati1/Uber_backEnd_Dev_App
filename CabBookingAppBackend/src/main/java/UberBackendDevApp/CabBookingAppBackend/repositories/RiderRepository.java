package UberBackendDevApp.CabBookingAppBackend.repositories;

import UberBackendDevApp.CabBookingAppBackend.entities.Rider;
import UberBackendDevApp.CabBookingAppBackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
    Optional<Rider> findByUser(User user);
}
