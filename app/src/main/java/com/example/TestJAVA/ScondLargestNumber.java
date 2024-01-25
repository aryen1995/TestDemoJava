package com.example.TestJAVA;

public class ScondLargestNumber {
    public static void main(String[] args) {
        int arr[] = {100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
        int largestnum=0;
        int seconlargestnum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largestnum)
            {
                largestnum=arr[i];
            }
            else if(arr[i]> seconlargestnum)
            {
              seconlargestnum=arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + seconlargestnum);
        System.out.println("Largest Number is: "  +largestnum);
    }
}
