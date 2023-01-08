package com.sweeti.lemon.domain.booking.service;

import com.sweeti.lemon.domain.booking.model.Booking;
import com.sweeti.lemon.domain.booking.model.http.BookingRequest;
import com.sweeti.lemon.domain.booking.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BookingService {

    private final BookingRepository bookingRepository;

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBooking(BigInteger id) {
        return bookingRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Transactional
    public Booking saveBooking(BookingRequest request) {
        return bookingRepository.save(request.toEntity());
    }

    @Transactional
    public void deleteBooking(BigInteger id) {
        bookingRepository.deleteById(id);
    }
}
