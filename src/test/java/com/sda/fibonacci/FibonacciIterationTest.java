package com.sda.fibonacci;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class FibonacciIterationTest {
    @Test
    public void testForOne(){
        //given
        FibonacciIteration fibonacciIteration = new FibonacciIteration();
        //when
        BigDecimal result = fibonacciIteration.getF(1);
        //then
        Assert.assertEquals(result,BigDecimal.valueOf(1));
    }
    @Test
    public void testForTwo(){
        //given
        FibonacciIteration fibonacciIteration = new FibonacciIteration();
        //when
        BigDecimal result = fibonacciIteration.getF(2);
        //then
        Assert.assertEquals(result,BigDecimal.valueOf(1));
    }
    @Test
    public void testForThree(){
        //given
        FibonacciIteration fibonacciIteration = new FibonacciIteration();
        //when
        BigDecimal result = fibonacciIteration.getF(3);
        //then
        Assert.assertEquals(result,BigDecimal.valueOf(2));
    }
    @Test
    public void testForTen(){
        //given
        FibonacciIteration fibonacciIteration = new FibonacciIteration();
        //when
        BigDecimal result = fibonacciIteration.getF(10);
        //then
        Assert.assertEquals(result,BigDecimal.valueOf(55));
    }
}
