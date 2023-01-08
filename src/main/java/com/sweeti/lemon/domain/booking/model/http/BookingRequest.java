package com.sweeti.lemon.domain.booking.model.http;

import com.sweeti.lemon.domain.booking.model.Booking;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookingRequest {

    private BigInteger bookingId;

    public Booking toEntity() {
        return Booking.builder()
                .build();
    }

}
