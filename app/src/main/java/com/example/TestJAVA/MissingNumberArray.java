package com.example.TestJAVA;

// Find the missing number given array
public class
MissingNumberArray {
    /*public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3,4, 6, 7, 8, 9, 10};
        int sum = (10*11)/2;
        int actualsum =0;
        for(int i=0;i<arr.length;i++){
            actualsum =actualsum+arr[i];
        }
        System.out.println("args = " +(sum - actualsum));
    }*/


     // o/p  5 missing number
    public static void main(String[] args) {
        String str1= "this Is The Aryendra Kumar rajput FBd";
        int mid= str1.length()/2;
        String lowerCase="";
        String upperCase ="";
        for (int i=0; i<str1.length();i++){
            if(i<mid){
            lowerCase =lowerCase + Character.toLowerCase(str1.charAt(i));
        }else {
                upperCase =upperCase + Character.toUpperCase(str1.charAt(i));
            }
        }
        System.out.println("args = " +lowerCase+upperCase);
    }

//o/p  this is the aryendRA KUMAR RAJPUT FBD

}
