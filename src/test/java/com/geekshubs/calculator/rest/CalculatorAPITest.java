package com.geekshubs.calculator.rest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAPITest {

    @Test
    public void testPing() {
        assertThat(new CalculatorAPI().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Test
    public void testAdd() {
        assertEquals(34, new CalculatorAPI().Add(8, 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(4, new CalculatorAPI().Sub(12, 8).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, new CalculatorAPI().Mul(11, 8).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, new CalculatorAPI().Div(12, 12).getResult());
    }
}
