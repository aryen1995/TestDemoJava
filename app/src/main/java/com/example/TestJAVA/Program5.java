package com.example.TestJAVA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program5 {
    /*public static void main(String[] args) {
        String str = "java program";
        Map<Character, Integer> dupCharMap = new HashMap<>();
        char[] charArr = str.toCharArray();
        for (char keys: charArr){
            if(Character.isAlphabetic(keys)) {
                if (dupCharMap.containsKey(keys)) {
                    dupCharMap.put(keys, dupCharMap.get(keys) + 1);
                } else {
                    dupCharMap.put(keys, 1);
                }
            }
        }
        dupCharMap.entrySet().removeIf(i ->i.getValue()==1);
        System.out.println(dupCharMap);
    }*/

    public static void main(String[] args) {
        String str = new String("aryendra");
        int count =0;
        char[] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                  if(ch[i]== ch[j]){
                      System.out.println("duplicat charcture \n" + ch[j]);
                      count++;
                  }
            }
        }
        System.out.println("Program5.main \n" + count);
    }
}
