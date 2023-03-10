package com.sweeti.lemon.domain.billing.controller;

import com.sweeti.lemon.domain.billing.service.BillingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1.0/api", consumes = MediaType.APPLICATION_JSON_VALUE)
public class BillingController {

    private final BillingService billingService;
}
