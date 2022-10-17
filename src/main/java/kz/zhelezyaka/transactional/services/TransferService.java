package kz.zhelezyaka.transactional.services;

import kz.zhelezyaka.transactional.model.Account;
import kz.zhelezyaka.transactional.repositories.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService {
    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public List<Account> findAccountsByName(String name) {
        return accountRepository.findAccountsByName(name);
    }

    @Transactional
    public void transferMoney(long idSender, long idReceiver, BigDecimal amount) throws AccountNotFoundException {
        Account sender =
                accountRepository.findById(idSender)
                        .orElseThrow(() -> new AccountNotFoundException());
        Account receiver =
                accountRepository.findById(idReceiver)
                        .orElseThrow(() -> new AccountNotFoundException());

        BigDecimal senderNewAmount =
                sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount =
                receiver.getAmount().add(amount);

        accountRepository
                .changeAmount(idSender, senderNewAmount);
        accountRepository
                .changeAmount(idReceiver, receiverNewAmount);
    }
}
