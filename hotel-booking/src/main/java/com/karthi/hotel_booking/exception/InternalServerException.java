package com.karthi.hotel_booking.exception;
public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}