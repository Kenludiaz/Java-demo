package com.example.math;

public class Series {
    static int nSUm(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            result += i;
        }
        return result;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }
    static int fibonacci(int n) {
        int prev = 0;
        int current = 1;
        for (int i = 1; i < n; i++) {
            int temp = current;
            current = current + prev;
            prev = temp;
        }
        return current;
    }
}
