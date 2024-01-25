package com.example.TestJAVA;

public class SquareElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};

        int square=0;
        for(int i=0;i<arr.length;i++){
            square = arr[i]*arr[i];
            System.out.println("square of"+square);

        }

    }
}
