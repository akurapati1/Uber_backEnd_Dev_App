package UberBackendDevApp.CabBookingAppBackend.services.impl;

import UberBackendDevApp.CabBookingAppBackend.dto.WalletTransactionDto;
import UberBackendDevApp.CabBookingAppBackend.entities.WalletTransaction;
import UberBackendDevApp.CabBookingAppBackend.repositories.WalletTransactionRepository;
import UberBackendDevApp.CabBookingAppBackend.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }

}
