package com.geekshubs.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAdd() {
        assertEquals(34, calculatorService.Add(8, 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(4, calculatorService.Sub(12, 8).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, calculatorService.Mul(11, 8).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, calculatorService.Div(12, 12).getResult());
    }
}
