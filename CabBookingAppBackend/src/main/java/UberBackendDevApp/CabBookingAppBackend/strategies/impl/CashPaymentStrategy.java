package UberBackendDevApp.CabBookingAppBackend.strategies.impl;

import UberBackendDevApp.CabBookingAppBackend.entities.Driver;
import UberBackendDevApp.CabBookingAppBackend.entities.Payment;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.PaymentStatus;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.TransactionMethod;
import UberBackendDevApp.CabBookingAppBackend.repositories.PaymentRepository;
import UberBackendDevApp.CabBookingAppBackend.services.WalletService;
import UberBackendDevApp.CabBookingAppBackend.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//Rider -> 100
//Driver -> 70 Deduct 30Rs from Driver's wallet

@Service
@RequiredArgsConstructor
public class CashPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;
    private final PaymentRepository paymentRepository;

    @Override
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();

        double platformCommission = payment.getAmount() * PLATFORM_COMMISSION;

        walletService.deductMoneyFromWallet(driver.getUser(), platformCommission, null,
                payment.getRide(), TransactionMethod.RIDE);

        payment.setPaymentStatus(PaymentStatus.CONFIRMED);
        paymentRepository.save(payment);
    }
}

//10 ratingsCount -> 4.0
//new rating 4.6
//updated rating
//new rating 44.6/11 -> 4.05