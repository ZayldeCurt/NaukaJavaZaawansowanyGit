package com.sda.fibonacci;

import java.math.BigDecimal;

public class FibonacciRecursive implements Fibonacci {
    public BigDecimal getF(int n){

        if(n<3){
            return BigDecimal.valueOf(1);
        }
        else{
            return getF(n-2).add(getF(n-1));
        }


    }

}
