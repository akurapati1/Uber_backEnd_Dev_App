package UberBackendDevApp.CabBookingAppBackend.entities;

import UberBackendDevApp.CabBookingAppBackend.entities.enums.PaymentMethod;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.PaymentStatus;
import jakarta.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    private Double amount;
    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;


}
