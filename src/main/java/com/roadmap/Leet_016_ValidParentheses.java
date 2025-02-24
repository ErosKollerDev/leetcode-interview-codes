package com.roadmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * <p>
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: s = "(]"
 * <p>
 * Output: false
 * <p>
 * Example 4:
 * <p>
 * Input: s = "([])"
 * <p>
 * Output: true
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class Leet_016_ValidParentheses {
    public static void main(String[] args) {
        Leet_016_ValidParentheses leet = new Leet_016_ValidParentheses();
        System.out.println(leet.isValid("()"));//true
        System.out.println(leet.isValid("()[]{}"));//true
        System.out.println(leet.isValid("([])"));//true
        System.out.println(leet.isValid("()[]{}"));//true
        System.out.println(leet.isValid("(]"));//false
    }

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            if (map.containsKey(current)) {
                char popChar = stack.size() != 0 ? stack.pop() : '&';
                if (popChar != map.get(current)) {
                    return false;
                }
            } else {
                stack.push(current);
            }
        }


        return stack.size() == 0 ? true : false;
    }
}