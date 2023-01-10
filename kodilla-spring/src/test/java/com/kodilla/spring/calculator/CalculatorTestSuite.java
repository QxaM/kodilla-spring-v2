package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double addResult = calculator.add(3, 4);
        double subResult = calculator.sub(3, 4);
        double mulResult = calculator.mul(3, 4);
        double divResult = calculator.div(3, 4);

        //Then
        assertAll(() -> assertEquals(7, addResult),
                () -> assertEquals(-1, subResult),
                () -> assertEquals(12, mulResult),
                () -> assertEquals(0.75, divResult, 0.0001));
    }
}
