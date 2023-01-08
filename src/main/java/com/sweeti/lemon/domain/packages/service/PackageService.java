package com.sweeti.lemon.domain.packages.service;

import com.sweeti.lemon.domain.packages.repository.PackageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PackageService {

    private final PackageRepository packageRepository;
}
