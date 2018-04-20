package com.sda.fibonacci;

public class FibonacciFactory {
    public Fibonacci createFibonacci(FibonacciType type){
        switch(type){
            case FIBONACCI_RECURSIVE:
                return new FibonacciRecursive();
            case FIBONACCI_ITERATION:
                return new FibonacciIteration();
            default:
                return null;

        }
    }
}
