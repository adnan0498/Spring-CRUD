package com.adnan.Spring_CRUD.exception;

import org.springframework.http.HttpStatus;

public record CloudVendorException(String message, Throwable throwable, HttpStatus httpStatus) {
}
