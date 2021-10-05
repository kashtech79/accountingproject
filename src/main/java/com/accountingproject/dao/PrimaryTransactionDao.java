package com.accountingproject.dao;

import com.accountingproject.entity.PrimaryAccount;
import com.accountingproject.entity.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {
    List<PrimaryTransaction> findByAccountNumber (PrimaryTransaction primaryTransaction);
}
