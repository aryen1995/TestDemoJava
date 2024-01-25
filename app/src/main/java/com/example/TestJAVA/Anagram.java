package com.example.TestJAVA;

public class Anagram {
    public static void main(String[] args) {
        double ar[] = {12.45, 23.58, 17.13, 42.89, 33.78, 71.85};
        double temp=0.0;
        for (int i=0;i<ar.length;i++){
            for (int j=0;j<ar.length-1;j++)
            {
                if(ar[j]>ar[j+1]){
                    temp= ar[j];
                    ar[j]= ar[j+1];
                    ar[j+1]= temp;
                }
            }
        }
        for (double num: ar){
            System.out.println(""+num);

        }

    }

}
