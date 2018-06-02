package com.aeon.hkrnk.str;

import java.util.Stack;

/**
 * Created by roshane on 6/2/2018.
 */
public class SuperReduceString {

    public static void main(String[] args) {
        System.out.println(super_reduced_string("aaabccddd"));
        System.out.println(super_reduced_string("aa"));
        System.out.println(super_reduced_string("baab"));
    }

    // Complete the super_reduced_string function below.
    static String super_reduced_string(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            return "Empty String";
        } else {
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
    }
}
