package com.example.TestJAVA;

public class RemoveDuplicatInArray {
    public static void main(String[] args) {
        int[] a= {1,2,3,3,4,5,6,4,7};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=-1;
                }
            }
        }
        for (int i=0;i<a.length;i++)
        if(a[i]!=-1){
            System.out.printf(" "+a[i]);
        }
    }
}
