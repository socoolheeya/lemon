package com.sweeti.lemon.domain.billing.service;

import com.sweeti.lemon.domain.billing.repository.BillingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BillingService {

    private final BillingRepository billingRepository;
}
