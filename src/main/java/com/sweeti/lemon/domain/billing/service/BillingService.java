package com.sweeti.lemon.domain.billing.service;

import com.sweeti.lemon.domain.billing.model.Billing;
import com.sweeti.lemon.domain.billing.model.http.BillingRequest;
import com.sweeti.lemon.domain.billing.repository.BillingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BillingService {

    private final BillingRepository billingRepository;

    public List<Billing> getBillings() {
        return billingRepository.findAll();
    }

    public Billing getBilling(BigInteger id) {
        return billingRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
    }

    @Transactional
    public Billing save(BillingRequest request) {
        return billingRepository.save(Billing.toEntity(request));
    }

    @Transactional
    public void delete(BigInteger id) {
        billingRepository.deleteById(id);
    }
}
