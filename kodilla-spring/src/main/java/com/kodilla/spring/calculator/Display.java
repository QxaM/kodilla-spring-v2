package com.kodilla.spring.calculator;

import org.springframework.stereotype.Controller;

@Controller
public class Display {

    public void displayValue(double val) {
        System.out.println("Calculation result is: " + val);
    }
}
