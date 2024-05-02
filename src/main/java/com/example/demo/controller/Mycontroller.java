package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")
public class Mycontroller {
    @GetMapping("/data")
    public String getData() {
        int a =600;
        return "Hello from backend"+a;

    }
    @GetMapping("/calc")
    public String calc(
            @RequestParam double n1,
            @RequestParam double n2,
            @RequestParam(required = false, defaultValue = "add") String operation
    ) {
        double result;
        switch (operation) {
            case "add":
                result = n1 + n2;
                return "Addition: " + result;
            case "sub":
                result = n1 - n2;
                return "Subtraction: " + result;
            case "mul":
                result = n1 * n2;
                return "Multiplication: " + result;
            case "div":
                if (n2 != 0) {
                    result = n1 / n2;
                    return "Division: " + result;
                } else {
                    return "Error: Division by zero";
                }
            default:
                return "Invalid operation";
        }
    }
}
    
    

