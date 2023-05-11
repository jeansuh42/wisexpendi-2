package com.wiselab.WISExpendi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    @GetMapping("/rest")
    public ResponseEntity<List> adminHome(){

        List<String> list = new ArrayList<>();
        list.add("sample");
        list.add("data");
        list.add("input");

        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

}
