package com.ifglife.hackrank.controller;

import com.ifglife.hackrank.exception.BuzzException;
import com.ifglife.hackrank.exception.FizzBuzzException;
import com.ifglife.hackrank.exception.FizzException;
import com.ifglife.hackrank.response.FizzBuzzResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    @GetMapping("/controller_advice/{code}")
    public FizzBuzzResponse getResponse(@PathVariable String code) {
        switch (code.toLowerCase()) {
            case "fizz" ->
                throw new FizzException("Fizz error occurred");
            case "buzz" ->
                throw new BuzzException("Buzz error occurred");
            case "fizzbuzz" ->
                throw new FizzBuzzException("FizzBuzz error occurred");
            case "success" -> {
                return new FizzBuzzResponse("Success");
            }
            default -> {
                return new FizzBuzzResponse("Invalid code");
            }
        }
    }
}
