package cabs.t24bi.reports.controller;

import cabs.t24bi.reports.exception.ResourceNotFoundException;
import cabs.t24bi.reports.model.ACCOUNT;
import cabs.t24bi.reports.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    AccountService accountService;

    // Fetch all Account records
    @GetMapping
    public List<ACCOUNT> getAllAccounts(){
        return accountService.getAllAccounts();
    }
    // Fetch single Account
    @GetMapping("/{id}")
    public ACCOUNT getAccountById(@PathVariable("id") Long accountId) throws Throwable {
        return (ACCOUNT) accountService.getAccountById(accountId)
                .orElseThrow(()->new ResourceNotFoundException("Account with ID :"+accountId+" Not Found!")); }


}
