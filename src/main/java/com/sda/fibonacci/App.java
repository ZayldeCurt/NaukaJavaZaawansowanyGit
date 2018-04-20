package com.sda.fibonacci;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
//        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
//        System.out.println(fibonacciRecursive.getF(4));

//        BigDecimal tmp = FibonacciGenerator.fibonacci(2,FibonacciType.FIBONACCI_ITERATION);
//        System.out.println(tmp);
//        BigDecimal tmp2 = FibonacciGenerator.fibonacci(2,FibonacciType.FIBONACCI_RECURSIVE);
//        System.out.println(tmp2);

        System.out.println(FibonacciGenerator.fibonacci(1, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(2, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(3, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(4, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(5, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(6, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(7, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(8, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(9, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(10, FibonacciType.FIBONACCI_ITERATION));
        System.out.println(FibonacciGenerator.fibonacci(11, FibonacciType.FIBONACCI_ITERATION));

    }

}
