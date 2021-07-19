package cabs.t24bi.reports.service;

import cabs.t24bi.reports.model.ACCOUNT;
import cabs.t24bi.reports.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;


    @Override

    public Optional<ACCOUNT> getAccountById(Long accountId) {
        return accountRepository.findById( accountId ) ;
    }

    @Override
    public List<ACCOUNT> getAllAccounts() {
        return accountRepository.findAll();
    }


}
