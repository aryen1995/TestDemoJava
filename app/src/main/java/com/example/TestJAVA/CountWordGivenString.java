package com.example.TestJAVA;

import java.util.HashMap;

public class CountWordGivenString {
    public static void main(String[] args) {
        String str= "this this is is the the aryendra aryendra kumar rajput";
        String[] spl = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<spl.length;i++){
            if(map.containsKey(spl[i])){
                int count= map.get(spl[i]);
                map.put(spl[i], count +1);
            }else {
                map.put(spl[i],1);
            }
        }
        System.out.println(map);
    }
}
