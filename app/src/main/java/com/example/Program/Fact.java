package com.example.Program;

public class Fact {
    //1,2,3,4,,5,6,7,8,9,10,11,12
    //even number
    //squre of each element
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                int sqre=arr[i]*arr[i];
                System.out.println(""+sqre);
                int a=arr[i];
                System.out.println(""+a);
            }
        }
    }
}

