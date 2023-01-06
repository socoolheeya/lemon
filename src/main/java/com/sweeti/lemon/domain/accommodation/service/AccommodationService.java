package com.sweeti.lemon.domain.accommodation.service;


import com.sweeti.lemon.domain.accommodation.model.Accommodation;
import com.sweeti.lemon.domain.accommodation.model.http.AccommodationRequest;
import com.sweeti.lemon.domain.accommodation.repository.AccommodationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AccommodationService {

    private final AccommodationRepository accommodationRepository;

    public List<Accommodation> getAccommodations() {
        return accommodationRepository.findAll();
    }

    public Accommodation getAccommodation(BigInteger id) {
        return accommodationRepository.getReferenceById(id);
    }

    @Transactional
    public Accommodation saveAccommodation(AccommodationRequest request) {
        return accommodationRepository.save(request.toEntity());
    }

    @Transactional
    public void deleteAccommodation(BigInteger id) {
        accommodationRepository.deleteById(id);
    }

    @Transactional
    public void deleteAccommodation(AccommodationRequest request) {
        accommodationRepository.delete(request.toEntity());
    }
}
