package com.example.TestJAVA;
//Remove A char in the given string
public class RemoveCharInString {
    public static void main(String[] args) {
        String str = "Aryendra";
        char ch ='A';
        char chi ='a';
        removeChr(str, ch, chi);
    }
    public static void removeChr(String str, char c,char m){
        int n =str.length();
        String finalstr ="";
        for(int i=0;i<n;i++){
            if((str.charAt(i)!= c )&&(str.charAt(i)!= m)){
                finalstr = finalstr+str.charAt(i);
            }

        }
        System.out.println(finalstr);

    }
}
