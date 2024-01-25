package com.example.Program;

public class Program {
    public static void main(String[] args) {
        int count=0;
        int n=100;
        for(int i=2;i<=n;i++){
            count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                count++;
                break;
                }
            }
            if(count==0) {
                System.out.print(" " +i);
            }
        }

    }
}
