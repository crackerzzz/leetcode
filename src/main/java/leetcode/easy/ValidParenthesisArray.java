package leetcode.easy;

import java.util.Stack;

/**
 * 
 * 
 *
 * <pre>
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 * </pre>
 * 
 * @author shreejwal.shrestha
 *
 */
public class ValidParenthesisArray {
	public static void main(String[] args) {
		System.out.println(new Solution().isValid("{[]}"));
	}

	static class Solution {
		public boolean isValid(String s) {
			final Stack<Character> stack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				final char cur = s.charAt(i);
				if (!stack.isEmpty() && isMatch(stack.peek(), cur)) {
					stack.pop();
				} else {
					stack.push(cur);
				}
			}

			return stack.isEmpty();
		}

		public boolean isMatch(char opening, char closing) {
			return (opening == '(' && closing == ')') || (opening == '[' && closing == ']')
					|| (opening == '{' && closing == '}');
		}
	}
}
