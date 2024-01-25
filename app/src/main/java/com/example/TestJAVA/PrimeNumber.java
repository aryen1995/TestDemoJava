package com.example.TestJAVA;

public class PrimeNumber {
    public static void main(String[] args) {
        int check;
        int n = 7;
        System.out.println("PrimeNumber ---1-to--100  :");
        //for (int i = 2; i <= n; i++) {
            check = 0;
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    check++;
                }
            }
            if (check == 2)
            System.out.println( "prime ");
            else
                System.out.println( "not prime ");

        // }
    }
}
