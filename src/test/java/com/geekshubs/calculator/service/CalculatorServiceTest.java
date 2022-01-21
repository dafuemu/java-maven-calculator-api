package com.geekshubs.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    @Test
    public void testSum() {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.sum(1, 2);

        assertEquals(3, result);
    }

    @Test
    public void testRes() {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.res(1, 2);

        assertEquals(-1, result);
    }

    @Test
    public void testMul() {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.mul(2, 1);

        assertEquals(2, result);
    }

    @Test
    public void testDiv() {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.div(2, 1);

        assertEquals(2, result);
    }

    @Test
    public void testDivByZero() {
        CalculatorService calculatorService = new CalculatorService();
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculatorService.div(2, 0);
        });

        assertEquals("Cannot divide by 0", thrown.getMessage());

    }

}
