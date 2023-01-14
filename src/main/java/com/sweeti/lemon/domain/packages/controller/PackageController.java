package com.sweeti.lemon.domain.packages.controller;

import com.sweeti.lemon.domain.packages.model.http.PackageRequest;
import com.sweeti.lemon.domain.packages.service.PackageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1.0/api", consumes = MediaType.APPLICATION_JSON_VALUE)
public class PackageController {

    private final PackageService packageService;

    @GetMapping("/package")
    public ResponseEntity<?> getPackages() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(packageService.getPackages());
    }

    @GetMapping("/package/{packageId}")
    public ResponseEntity<?> getPackage(@PathVariable BigInteger packageId) {
        return ResponseEntity.status(HttpStatus.OK)
                        .body(packageService.getPackage(packageId));

    }

    @PostMapping("/package")
    public ResponseEntity<?> insertPackage(PackageRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                        .body(packageService.savePackage(request));
    }

    @PutMapping("/package")
    public ResponseEntity<?> updatePackage(PackageRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                        .body(packageService.savePackage(request));
    }

    @DeleteMapping("/package/{packageId}")
    public ResponseEntity<?> deletePackage(@PathVariable BigInteger packageId) {
        packageService.deletePackage(packageId);
        return ResponseEntity.status(HttpStatus.OK)
                        .body(ResponseEntity.noContent());

    }
}
