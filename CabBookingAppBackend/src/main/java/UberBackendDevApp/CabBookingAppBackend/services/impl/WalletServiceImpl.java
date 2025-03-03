package UberBackendDevApp.CabBookingAppBackend.services.impl;

import UberBackendDevApp.CabBookingAppBackend.dto.RideDto;
import UberBackendDevApp.CabBookingAppBackend.dto.WalletDto;
import UberBackendDevApp.CabBookingAppBackend.dto.WalletTransactionDto;
import UberBackendDevApp.CabBookingAppBackend.entities.Ride;
import UberBackendDevApp.CabBookingAppBackend.entities.User;
import UberBackendDevApp.CabBookingAppBackend.entities.Wallet;
import UberBackendDevApp.CabBookingAppBackend.entities.WalletTransaction;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.TransactionMethod;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.TransactionType;
import UberBackendDevApp.CabBookingAppBackend.exceptions.ResourceNotFoundException;
import UberBackendDevApp.CabBookingAppBackend.repositories.WalletRepository;
import UberBackendDevApp.CabBookingAppBackend.services.WalletService;
import UberBackendDevApp.CabBookingAppBackend.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    private final WalletRepository walletRepository;
    private final WalletTransactionService walletTransactionService;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public Wallet addMoneyToWallet(User user, Double amount, String transactionId, Ride ride, TransactionMethod transactionMethod) {
        Wallet wallet = findByUser(user);
        wallet.setBalance(wallet.getBalance()+amount);

        WalletTransaction walletTransaction = WalletTransaction.builder()
                .transactionId(transactionId)
                .ride(ride)
                .wallet(wallet)
                .transactionType(TransactionType.CREDIT)
                .transactionMethod(transactionMethod)
                .amount(amount)
                .build();

        walletTransactionService.createNewWalletTransaction(walletTransaction);

        return walletRepository.save(wallet);
    }

    @Override
    @Transactional
    public Wallet deductMoneyFromWallet(User user, Double amount,
                                        String transactionId, Ride ride,
                                        TransactionMethod transactionMethod) {
        Wallet wallet = findByUser(user);
        wallet.setBalance(wallet.getBalance()-amount);

        WalletTransaction walletTransaction = WalletTransaction.builder()
                .transactionId(transactionId)
                .ride(ride)
                .wallet(wallet)
                .transactionType(TransactionType.DEBIT)
                .transactionMethod(transactionMethod)
                .amount(amount)
                .build();

        walletTransactionService.createNewWalletTransaction(walletTransaction);

//        wallet.getTransactions().add(walletTransaction);

        return walletRepository.save(wallet);
    }

    @Override
    public void withdrawAllMyMoneyFromWallet() {

    }

    @Override
    public Wallet findWalletById(Long walletId) {
        return walletRepository.findById(walletId)
                .orElseThrow(() -> new ResourceNotFoundException("Wallet not found with id: "+walletId));
    }

    @Override
    public Wallet createNewWallet(User user) {
        Wallet wallet = new Wallet();
        wallet.setUser(user);
        return walletRepository.save(wallet);
    }

    @Override
    public Wallet findByUser(User user) {
        return walletRepository.findByUser(user)
                .orElseThrow(() -> new ResourceNotFoundException("Wallet not found for user with id: "+user.getId()));
    }
}
