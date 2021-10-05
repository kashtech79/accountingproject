package com.accountingproject.controller;

import com.accountingproject.entity.PrimaryAccount;
import com.accountingproject.entity.PrimaryTransaction;
import com.accountingproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
//@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/primaryAccount")
    public ResponseEntity<String> primaryAccount(@RequestBody PrimaryAccount primaryAccount) {
        return accountService.createPrimaryAccount(primaryAccount);
    }

    @PostMapping("/primaryTransaction")
    public ResponseEntity<String> primaryTransaction(@RequestBody PrimaryTransaction primaryTransaction) {
        return accountService.createPrimaryTransaction(primaryTransaction);
    }
}
