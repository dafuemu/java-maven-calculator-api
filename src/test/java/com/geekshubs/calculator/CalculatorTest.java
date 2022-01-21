package com.geekshubs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(1, 2);

        assertEquals(3, result);
    }

    @Test
    public void testRes() {
        Calculator calculator = new Calculator();
        int result = calculator.res(2, 1);

        assertEquals(1, result);
    }

    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(2, 1);

        assertEquals(2, result);
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int result = calculator.div(2, 1);

        assertEquals(2, result);
    }

    @Test
    public void testDivByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.div(2, 0);
        });
    }

}
