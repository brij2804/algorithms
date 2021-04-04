package com.brijesh.recursion;

public class BiggestNumber {

    static int highest=Integer.MIN_VALUE;

    public int findHighestValue(int[] array,int size){

        if(size == -1){
            return highest;
        }else{
            if(array[size]>highest){
                highest = array[size];
            }
        }
        return findHighestValue(array,size-1);
    }

    public static void main(String[] args){

        BiggestNumber obj = new BiggestNumber();
        int[] arr= new int[]{40,55,63,17,22,68,89,97,89};
        int finaAns = obj.findHighestValue(arr,8);
        System.out.println("final answer is : "+finaAns);
    }
}
