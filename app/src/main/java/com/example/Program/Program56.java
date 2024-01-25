package com.example.Program;

public class Program56 {
    public static void main(String[] args) {
        int[] a= {1,2,2,3,5,6,8,8};
        for(int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            if(a[i]!=-1){
               System.out.println(""+a[i]);

            }
        }
    }
}
