package com.sweeti.lemon.domain.billing.repository;

import com.sweeti.lemon.domain.billing.model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Integer> {
}
