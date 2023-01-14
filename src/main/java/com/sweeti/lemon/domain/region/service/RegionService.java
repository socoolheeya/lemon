package com.sweeti.lemon.domain.region.service;

import com.sweeti.lemon.domain.region.model.Region;
import com.sweeti.lemon.domain.region.model.http.RegionRequest;
import com.sweeti.lemon.domain.region.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionRepository regionRepository;

    public List<Region> getRegions() {
        return regionRepository.findAll();
    }

    public Region getRegion(BigInteger id) {
        return regionRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
    }

    public Region save(RegionRequest request) {
        return regionRepository.save(Region.toEntitiy(request));
    }
}
