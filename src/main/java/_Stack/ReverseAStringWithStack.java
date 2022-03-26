package _Stack;

import java.util.Stack;

public class ReverseAStringWithStack {

    // use for preparation: https://www.interviewbit.com/data-structure-interview-questions/

    public static void main(String[] args) {

        Stack<String> stack = new Stack();
        String original = "I want to reverse this string";
        String result = "";

        for(int i=0; i<original.length(); i++){
            stack.push(original.substring(i,i+1));
        }

        while(!stack.empty()){
            result = result + stack.pop();
        }

        System.out.println(original);
        System.out.println(result);


    }



}
