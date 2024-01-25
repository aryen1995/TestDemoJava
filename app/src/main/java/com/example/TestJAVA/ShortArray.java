package com.example.TestJAVA;

public class ShortArray {
    public static void main(String[] args) {
        int num[]= {5,4,8,6,2,9,3,7};
        int size =num.length;
        int temp;
        for(int num1: num){
            System.out.print( num1+" ");
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(num[j]>num[j+1]){
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1]= temp;
                    temp= num[j+1];
                }
            }
        }
        for(int num2: num){
            System.out.println();
            System.out.print(num2+" ");
        }
    }
}
