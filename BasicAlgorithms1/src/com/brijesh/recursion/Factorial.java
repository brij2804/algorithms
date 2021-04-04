package com.brijesh.recursion;

public class Factorial {

    public int factorial(int n){
        if(n<1){
            return 1;
        }
        return (n*factorial(n-1));
    }

    public static void main(String[] args){
      // testing our factorial
        Factorial obj= new Factorial();
        int finalAns=obj.factorial(3);
        System.out.println("final ans:"+finalAns);
    }
}
