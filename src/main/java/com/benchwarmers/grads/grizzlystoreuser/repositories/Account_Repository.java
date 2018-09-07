package com.benchwarmers.grads.grizzlystoreuser.repositories;

import com.benchwarmers.grads.grizzlystoreuser.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Account_Repository extends JpaRepository<Account, UUID> {

}