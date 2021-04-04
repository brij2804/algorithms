package com.brijesh;

public class MergeTwoSortedArray {

    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
        int i=0, j=0, k=0;

        // traverse both the arrays
        while(i<n1 && j<n2){
            // check the current element of first array is smaller then the
            if(arr1[i]<arr2[j]){
                arr3[k++]= arr1[i++];
            }else{
                arr3[k++]=arr2[j++];
            }
        }

        //store the remaining elements of arr1
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        // store remaining element of arr2
        while(j<n2){
            arr3[k++]=arr2[j++];
        }

        for (int ar: arr3) {
            System.out.print(ar +" ");
        }
    }

    public static void main(String[] args){
        int[] arr1={1,4,6,8,9};
        int[] arr2 = {2,3,7,8,10};
        int n1= arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        mergeArrays(arr1,arr2,n1,n2,arr3);
    }
}
