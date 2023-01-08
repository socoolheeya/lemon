package com.sweeti.lemon.domain.packages.controller;

import com.sweeti.lemon.domain.packages.service.PackageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1.0/api", consumes = MediaType.APPLICATION_JSON_VALUE)
public class PackageController {

    private final PackageService packageService;
}
