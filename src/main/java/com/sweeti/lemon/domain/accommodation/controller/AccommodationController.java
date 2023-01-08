package com.sweeti.lemon.domain.accommodation.controller;


import com.sweeti.lemon.domain.accommodation.model.Accommodation;
import com.sweeti.lemon.domain.accommodation.model.http.AccommodationRequest;
import com.sweeti.lemon.domain.accommodation.service.AccommodationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1.0/api", consumes = MediaType.APPLICATION_JSON_VALUE)
public class AccommodationController {

    private final AccommodationService accommodationService;

    @GetMapping("/accommodations")
    public ResponseEntity<?> getAccommodations() {
        List<Accommodation> accommodations = accommodationService.getAccommodations();
        return new ResponseEntity<>(accommodations, HttpStatus.OK);
    }

    @GetMapping("/accommodations/{id}")
    public ResponseEntity<?> getAccommodation(@PathVariable  BigInteger id) throws Exception {
        Accommodation accommodation = accommodationService.getAccommodation(id);
        return new ResponseEntity<>(accommodation, HttpStatus.OK);
    }

    @PostMapping("/accommodations")
    public ResponseEntity<?> saveAccommodation(AccommodationRequest request) {
        Accommodation accommodation = accommodationService.saveAccommodation(request);
        return new ResponseEntity<>(accommodation, HttpStatus.OK);
    }

    @PutMapping("/accommodations/{id}")
    public ResponseEntity<?> updateAccommodation(@PathVariable  BigInteger id, @RequestBody AccommodationRequest request) {
        Accommodation accommodation = accommodationService.saveAccommodation(request);
        return new ResponseEntity<>(accommodation, HttpStatus.OK);

    }

    @DeleteMapping("/accommodations/{id}")
    public ResponseEntity<?> deleteAccommodation(@PathVariable  BigInteger id) {
        accommodationService.deleteAccommodation(id);
        return new ResponseEntity<>("success", HttpStatus.OK);

    }
}
