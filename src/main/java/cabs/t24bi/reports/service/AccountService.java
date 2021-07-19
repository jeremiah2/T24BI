package cabs.t24bi.reports.service;

import cabs.t24bi.reports.model.ACCOUNT;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<ACCOUNT> getAllAccounts();

    Optional getAccountById(Long accountId);
}
