package com.sweeti.lemon.domain.packages.service;

import com.sweeti.lemon.domain.packages.model.PackageInfo;
import com.sweeti.lemon.domain.packages.model.http.PackageRequest;
import com.sweeti.lemon.domain.packages.repository.PackageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PackageService {

    private final PackageRepository packageRepository;

    public List<PackageInfo> getPackages() {
        return packageRepository.findAll();
    }

    public PackageInfo getPackage(BigInteger id) {
        return packageRepository.findById(id).orElseThrow();
    }

    @Transactional
    public PackageInfo savePackage(PackageRequest request) {
        return packageRepository.save(request.toEntity());
    }

    @Transactional
    public void deletePackage(BigInteger id) {
        packageRepository.deleteById(id);
    }
}
