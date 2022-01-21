package com.geekshubs.calculator.service;

import com.geekshubs.calculator.Calculator;

public class CalculatorService {

    public int sum(int i, int j) {
        return new Calculator().sum(i, j);
    }

    public int res(int i, int j) {
        return new Calculator().res(i, j);
    }

    public int mul(int i, int j) {
        return new Calculator().mul(i, j);
    }

    public int div(int i, int j) throws ArithmeticException {
        try {
            return new Calculator().div(i, j);
        } catch (ArithmeticException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }
}
