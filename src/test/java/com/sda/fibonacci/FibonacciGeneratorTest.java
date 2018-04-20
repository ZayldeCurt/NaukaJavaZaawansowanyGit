package com.sda.fibonacci;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class FibonacciGeneratorTest {

    @Test
    public void testForFibonacciGenerator(){
        //Given

        //When
        BigDecimal result = FibonacciGenerator.fibonacci(10,FibonacciType.FIBONACCI_ITERATION);

        //Then
        Assert.assertEquals(BigDecimal.valueOf(55),result);
    }


}
