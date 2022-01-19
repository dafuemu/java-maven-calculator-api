package com.geekshubs.calculator;

public class Calculator {

    int _x;
    int _y;
    int _result;

    public Calculator(int x, int y, int result) {
        _x = x;
        _y = y;
        _result = result;
    }

    public int getX() {
        return _x;
    }

    public int getY() {
        return _y;
    }

    public int getResult() {
        return _result;
    }
}
