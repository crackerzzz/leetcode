package leetcode.easy;

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
public class ValidParenthesisStack {
	public static void main(String[] args) {
		System.out.println(new Solution().isValid("((((((((([[[]]])))))))))"));
	}

	static class Solution {
		public boolean isValid(String s) {
			final char[] stack = new char[s.length()];
			int counter = 0;
			for (int i = 0; i < s.length(); i++) {
				final char current = s.charAt(i);
				if (counter > 0 && isMatch(stack[counter - 1], current)) {
					counter--;
				} else {
					stack[counter++] = current;
				}
			}

			return counter == 0;
		}

		public boolean isMatch(char opening, char closing) {
			return (opening == '(' && closing == ')') || (opening == '[' && closing == ']')
					|| (opening == '{' && closing == '}');
		}
	}
}
