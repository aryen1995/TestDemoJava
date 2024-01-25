package com.example.TestJAVA;
//given array number 1,2,3,4,5,6,7,8,9
//o/p 2,4,6,8,1,3,5,7,9
public class EvenAndOddNumberArray {
    public static void main(String args[]){
        int[] arr1= {1, 2, 5, 4, 7, 11, 20};
        arrayEvenAndOdd(arr1);
    }
    public static void arrayEvenAndOdd(int arr[]){
        int[] a = new int[arr.length];
        int index =0;
        for(int i=0; i<arr.length;i++){
            if (arr[i] %2 ==0){
                a[index] =arr[i];
                index++;
            }
        }
        for(int i=0; i<arr.length;i++) {
            if(arr[i] % 2 !=0){
                a[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

        }
}
