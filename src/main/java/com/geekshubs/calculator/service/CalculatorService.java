package com.geekshubs.calculator.service;

import com.geekshubs.calculator.Calculator;

public class CalculatorService {

    public Calculator Add(int x, int y) {
        return new Calculator(x, y, x + y);
    }

    public Calculator Sub(int x, int y) {
        return new Calculator(x, y, x - y);
    }

    public Calculator Mul(int x, int y) {
        return new Calculator(x, y, x * y);
    }

    public Calculator Div(int x, int y) {
        return new Calculator(x, y, x / y);
    }
}
