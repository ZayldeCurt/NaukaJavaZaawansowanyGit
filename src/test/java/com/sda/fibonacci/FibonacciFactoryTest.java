package com.sda.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciFactoryTest {

    @Test
    public void testForFibonacciRecursive(){
        //given
        FibonacciFactory fibonacciFactory = new FibonacciFactory();

        //when
        Fibonacci fibonacci = fibonacciFactory.createFibonacci(FibonacciType.FIBONACCI_RECURSIVE);

        //then
        Assert.assertTrue(fibonacci instanceof FibonacciRecursive);
    }

    @Test
    public void testForFibonacciIteration(){
        //given
        FibonacciFactory fibonacciFactory = new FibonacciFactory();

        //when
        Fibonacci fibonacci = fibonacciFactory.createFibonacci(FibonacciType.FIBONACCI_ITERATION);

        //then
        Assert.assertTrue(fibonacci instanceof FibonacciIteration);
    }

}
