package com.sweeti.lemon.domain.region.model.http;

import jakarta.persistence.Column;
import lombok.Getter;

import java.math.BigInteger;

@Getter
public class RegionRequest {
    private BigInteger id;
    private String name;
    private Boolean useYn;
}
