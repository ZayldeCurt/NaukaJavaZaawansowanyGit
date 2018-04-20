package com.sda.fibonacci;

import java.math.BigDecimal;

public class FibonacciGenerator  {
    public static BigDecimal fibonacci(int value, FibonacciType type){
        FibonacciFactory fibonacciFactory  = new FibonacciFactory();

        Fibonacci fibonacci = fibonacciFactory.createFibonacci(type);
        return fibonacci.getF(value);
    }
}
