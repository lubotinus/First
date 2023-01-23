package com.First.testing.calculator;

public class Calculator {
 int a;
 int b;
    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add() {
        int resA = a + b;
        return resA;
    }

    public int subtract() {
        int resS = a-b;
        return resS;
    }
}
