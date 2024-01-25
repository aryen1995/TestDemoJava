package com.example.Program;


import java.util.HashSet;
import java.util.Set;

public class TestDemo {

        public static void main(String[] args) {
            String str = new String("arya");
            Set<Character> letters = new <Character>HashSet();
            for (int i = 0; i < str.length(); i++) {
                letters.add(str.charAt(i));
            }
            System.out.println(letters);
        }



}
