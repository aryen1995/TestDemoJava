package com.example.TestJAVA;

import java.util.Stack;

public class Program3 {
    public static void main(String args[]){
        String s= "{}()[]";
        boolean status = checkValidBracket(s);
        System.out.print(s);
        System.out.print(status);
    }
    private static boolean checkValidBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }else {
                    return false;
                }
            } else if (ch==')') {

                if(stack.peek()=='('){
                    stack.pop();
                }else {
                    return false;
                }
            } else if (ch==']') {
                if(stack.peek()=='['){
                    stack.pop();
                }else {
                    return false;
                }

            }else {
                stack.push(ch);
            }
        }
        if (stack.size()==0){
            return true;
        }
        return false;
    }


}
