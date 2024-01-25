package com.example.TestJAVA;

import java.util.Arrays;

//secand highest number in the array
public class LasgestNumber {
    public static void main(String[] args) {
        int number[] = new int[]{10,60,30,40,50,20,70};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int num: number){
            if(num>highest){
                secondHighest=highest;
                highest=num;
            } else if (num>secondHighest) {
                secondHighest =num;
            }
        }
        System.out.println("args = " +secondHighest);
    }
}
