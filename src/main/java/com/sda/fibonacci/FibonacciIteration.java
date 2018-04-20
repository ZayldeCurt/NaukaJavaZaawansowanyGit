package com.sda.fibonacci;

import java.math.BigDecimal;

public class FibonacciIteration implements Fibonacci {

//    int fibonacii=1;
//    int temp=0;
//    int temp2=1;
    BigDecimal fibonacii = new BigDecimal(1);
    BigDecimal temp = new BigDecimal(0);
    BigDecimal temp2= new BigDecimal(1);

    @Override
    public BigDecimal getF(int n) {
        n--;
        n--;
        n--;
        for(int i=0;i<=n;i++)
        {
            temp=temp2;
            temp2=fibonacii;
//            fibonacii=temp+temp2;
            fibonacii= temp.add(temp2);
        }

        return fibonacii;
    }
}
