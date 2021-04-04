package com.brijesh.pyramid;

public class PyramidClass {

    public void pyramid1(){
        /***
         * printing pyramid
         *       *
         *       **
         *       ***
         *       ****
         *       *****
         */
        int n=5;
        for (int i=0;i<n; i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pyramid2(){
        /**
         *        *
         *       **
         *      ***
         *     ****
         *    *****
         */
        int n=5;
        for(int i=0; i<n; i++){

            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0; k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pyramid3(){
        /**
         *           *
         *          * *
         *         * * *
         *        * * * *
         *       * * * * *
         */

        int n = 5;
        for(int i=0; i<5;i++){

            for(int j=0;j<i;j++){

            }

        }
    }


    public void pyramid4(){
        /**
         *        1
         *        3 2
         *        5 4 3
         *        7 6 5 4
         */
        int n=5;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(2*i-j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        PyramidClass pc = new PyramidClass();
        pc.pyramid4();
    }
}
