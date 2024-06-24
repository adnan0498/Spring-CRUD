package com.adnan.Spring_CRUD.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(String msg, HttpStatus status, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", msg);
        map.put("status", status);
        map.put("data", data);
        return new ResponseEntity<>(map, status);
    }
}
