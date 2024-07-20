package com.example;

import java.util.Random;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public String toString(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Null is not allowed.");
        }
        StringBuilder sb  = new StringBuilder();
        sb.append(a);
        sb.append(b);
        return sb.toString();
    }

    public int random() {
        Random rand = new Random();
        return rand.nextInt(101);
    }

}
