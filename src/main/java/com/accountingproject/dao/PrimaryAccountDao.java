package com.accountingproject.dao;

import com.accountingproject.entity.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {
    PrimaryAccount findByAccountNumber (String accountNumber);
}
