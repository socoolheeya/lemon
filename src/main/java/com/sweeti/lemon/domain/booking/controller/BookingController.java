package com.sweeti.lemon.domain.booking.controller;

import com.sweeti.lemon.domain.booking.model.http.BookingRequest;
import com.sweeti.lemon.domain.booking.service.BookingService;
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
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1.0/api", consumes = MediaType.APPLICATION_JSON_VALUE)
public class BookingController {

    private final BookingService bookingService;

    @GetMapping("/booking")
    public ResponseEntity<?> getBookings() {
        return new ResponseEntity<>(bookingService.getBookings(), HttpStatus.OK);
    }
    @GetMapping("/booking/{id}")
    public ResponseEntity<?> getBooking(@PathVariable BigInteger id) {
        return new ResponseEntity<>(bookingService.getBooking(id), HttpStatus.OK);
    }

    @PostMapping("/booking")
    public ResponseEntity<?> saveBooking(BookingRequest request) {
        return new ResponseEntity<>(bookingService.saveBooking(request), HttpStatus.OK);
    }

    @PutMapping("/booking/{id}")
    public ResponseEntity<?> updateBooking(@PathVariable(name = "booking_id")BigInteger bookingId, BookingRequest request) {
        return new ResponseEntity<>(bookingService.saveBooking(request), HttpStatus.OK);
    }

    @DeleteMapping("/booking/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable(name = "booking_id") BigInteger id) {
        bookingService.deleteBooking(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
