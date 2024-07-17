package com.bank.application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.application.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
