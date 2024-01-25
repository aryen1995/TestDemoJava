package com.example.TestJAVA;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate_Char_Count_String {
    public static void main(String[] args) {
        String str= "aryendrashdhfhfhfhsjsjsjdkdkdkdhfhfhf";
        /*int count=1;
        char[] arr= str.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                System.out.println(arr[j]);
               count++;
               break;
                }
            }
        }
        System.out.println(""+count);*/


        //convert string into stream
        Map<Character,Long> result= str.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        result.forEach((k,v)->{
            if (v>1){
                System.out.print("\n");
                System.out.print(k+":"+v);
            }
        });

    }
}
