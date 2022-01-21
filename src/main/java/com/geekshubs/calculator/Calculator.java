package com.geekshubs.calculator;

public class Calculator {

    public int sum(int i, int j) {
        return i + j;
    }

    public int res(int i, int j) {
        return i - j;
    }

    public int mul(int i, int j) {
        return i * j;
    }

    public int div(int i, int j) {
        if (j == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return i / j;
    }

}
