package com.example.TestJAVA;

public class ReversStringWord {
    public static void main(String a[]) {
        String str= "I am Aryendra Kumar rajput";
        String splitArr[]= str.split(" ");
        for(int i=splitArr.length-1;i>=0;i--){
            System.out.printf(" "/*+splitArr[i]*/);
            String str1= splitArr[i];
            char[] ch=str1.toCharArray();
            for (int j=ch.length-1;j>=0;j--){
                System.out.printf(""+ch[j]);
            }

        }

    }
}
