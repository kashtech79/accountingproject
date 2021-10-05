package com.accountingproject.service;

import com.accountingproject.entity.PrimaryAccount;
import com.accountingproject.entity.PrimaryTransaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountService {
    ResponseEntity<String> createPrimaryAccount(PrimaryAccount primaryAccount);
    ResponseEntity<String> createPrimaryTransaction(PrimaryTransaction primaryTransaction);
}
