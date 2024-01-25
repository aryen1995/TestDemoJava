package com.example.TestJAVA;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Aryendra");
        list.add("kumar");
        list.add("rajput");
        list.forEach((n)->{
            System.out.println(""+n);
        });
    }

}

