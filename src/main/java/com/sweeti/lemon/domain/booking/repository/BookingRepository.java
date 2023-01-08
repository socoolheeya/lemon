package com.sweeti.lemon.domain.booking.repository;

import com.sweeti.lemon.domain.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BookingRepository extends JpaRepository<Booking, BigInteger> {
}
