package com.sda.fibonacci;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
//import org.junit.Assert;
//import org.junit.Test;

public class FibonacciRecursiveTest {

    @Test
    public void testForOne(){
        //given
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        //when
        BigDecimal result = fibonacciRecursive.getF(1);
        //then
        Assert.assertEquals(result,BigDecimal.valueOf(1));
    }
    @Test
    public void testForTwo(){
        //given
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        //when
        BigDecimal result = fibonacciRecursive.getF(2);
        //then
        Assert.assertEquals(result,BigDecimal.valueOf(1));
    }
    @Test
    public void testForThree(){
        //given
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        //when
        BigDecimal result = fibonacciRecursive.getF(3);
        //then
        Assert.assertEquals(result,BigDecimal.valueOf(2));
    }
    @Test
    public void testForTen(){
        //given
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        //when
        BigDecimal result = fibonacciRecursive.getF(10);
        //then
        Assert.assertEquals(result,BigDecimal.valueOf(55));
    }
}
