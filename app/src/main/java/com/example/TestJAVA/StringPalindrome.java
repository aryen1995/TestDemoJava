package com.example.TestJAVA;
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "aba";
        char[] chr= str.toCharArray();
        String revers="";
        for (int i= chr.length-1; i>=0;i--){
           // System.out.print(chr[i]+"");
            revers = revers+str.charAt(i);
        }
        if(str.toLowerCase().equals(revers.toLowerCase())){
            System.out.println(str+"String is palindrome");
        }else {
            System.out.println(str+"String not palindrome");
        }
    }
}
