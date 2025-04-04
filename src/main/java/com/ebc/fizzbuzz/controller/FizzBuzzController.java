package com.ebc.fizzbuzz.controller;

import com.ebc.fizzbuzz.dto.FizzBuzzResponse;
import com.ebc.fizzbuzz.service.FizzBuzzService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fizzbuzz")
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;

    public FizzBuzzController(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping("/{limit}")
    public FizzBuzzResponse getFizzBuzz(@PathVariable int limit) {
        return new FizzBuzzResponse(fizzBuzzService.getFizzBuzz(limit));
    }
}
