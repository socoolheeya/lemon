package com.sweeti.lemon.domain.billing.repository;

import com.sweeti.lemon.domain.billing.model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BillingRepository extends JpaRepository<Billing, BigInteger> {
}
