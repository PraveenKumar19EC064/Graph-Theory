package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer,Long> dp=new HashMap<>();
    public static long fib(int n){
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        dp.put(n,fib(n-1)+fib(n-2));
        return dp.get(n);
    }
    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 100; i++) {
            System.out.println(i+" = "+fib(i));
        }

    }
}
