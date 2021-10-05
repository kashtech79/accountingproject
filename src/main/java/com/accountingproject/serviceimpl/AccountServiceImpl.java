package com.accountingproject.serviceimpl;

import com.accountingproject.dao.PrimaryAccountDao;
import com.accountingproject.dao.PrimaryTransactionDao;
import com.accountingproject.entity.PrimaryAccount;
import com.accountingproject.entity.PrimaryTransaction;
import com.accountingproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Date;

@Service
public class AccountServiceImpl implements AccountService {
//    private static int nextAccountNumber = 11223145;

    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private PrimaryTransactionDao primaryTransactionDao;


    public ResponseEntity<String> createPrimaryAccount(PrimaryAccount primaryAccount) {
        primaryAccountDao.save(primaryAccount);
        return ResponseEntity.ok("Record entered");
    }

    @Transactional
    public ResponseEntity<String> createPrimaryTransaction(PrimaryTransaction primaryTransaction) {
        primaryTransactionDao.save(primaryTransaction);
        return ResponseEntity.ok("Record entered");
    }


}
