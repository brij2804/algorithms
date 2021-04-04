package com.brijesh.recursion;

public class Fibonacci {

    public int fibonacci(int n) throws Exception{
        if (n < 1) {
            throw new Exception("It cannot be less than 1");
        }
        if(n==1 || n==2){
         return n-1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args){
        Fibonacci obj = new Fibonacci();
        try {
            int finalAns = obj.fibonacci(4);
            System.out.println("final ans is :"+finalAns);
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
