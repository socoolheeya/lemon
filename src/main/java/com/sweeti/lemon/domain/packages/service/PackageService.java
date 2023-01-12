package com.sweeti.lemon.domain.packages.service;

import com.sweeti.lemon.domain.packages.model.PackageInfo;
import com.sweeti.lemon.domain.packages.repository.PackageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PackageService {

    private final PackageRepository packageRepository;

    public List<PackageInfo> getPackages() {
        return packageRepository.findAll();
    }

    public PackageInfo getPackage(BigInteger id) {
        return packageRepository.findById(id).orElseThrow();
    }

    public PackageInfo savePackage(PackageInfo packageInfo) {
        return packageRepository.save(packageInfo);
    }

    public void deletePackage(BigInteger id) {
        packageRepository.deleteById(id);
    }
}
