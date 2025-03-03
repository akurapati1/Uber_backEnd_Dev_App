package UberBackendDevApp.CabBookingAppBackend.services.impl;

import UberBackendDevApp.CabBookingAppBackend.entities.Payment;
import UberBackendDevApp.CabBookingAppBackend.entities.Ride;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.PaymentStatus;
import UberBackendDevApp.CabBookingAppBackend.exceptions.ResourceNotFoundException;
import UberBackendDevApp.CabBookingAppBackend.repositories.PaymentRepository;
import UberBackendDevApp.CabBookingAppBackend.services.PaymentService;
import UberBackendDevApp.CabBookingAppBackend.strategies.PaymentStrategyManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentStrategyManager paymentStrategyManager;

    @Override
    public void processPayment(Ride ride) {
        Payment payment = paymentRepository.findByRide(ride)
                .orElseThrow(() -> new ResourceNotFoundException("Payment not found for ride with id: "+ride.getId()));
        paymentStrategyManager.paymentStrategy(payment.getPaymentMethod()).processPayment(payment);
    }

    @Override
    public Payment createNewPayment(Ride ride) {
        Payment payment = Payment.builder()
                .ride(ride)
                .paymentMethod(ride.getPaymentMethod())
                .amount(ride.getFare())
                .paymentStatus(PaymentStatus.PENDING)
                .build();
        return paymentRepository.save(payment);
    }

    @Override
    public void updatePaymentStatus(Payment payment, PaymentStatus status) {
        payment.setPaymentStatus(status);
        paymentRepository.save(payment);
    }
}
