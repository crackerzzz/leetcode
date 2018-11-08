package leetcode.easy;

/**
 * <pre>
 * Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * </pre>
 * 
 * @author shreejwal.shrestha
 *
 */
public class ImplementStrStr {
	public static void main(String[] args) {
		int index = new Solution().strStr("hello", "");
		System.out.println("Count: " + index);
	}

	static class Solution {
		public int strStr(String haystack, String needle) {
			return haystack.indexOf(needle);
			// final char[] needleChars = needle.toCharArray();
			// if (needleChars.length == 0) {
			// return 0;
			// }
			//
			// // locate first index
			// final char[] haystackChars = haystack.toCharArray();
			// int index = -1;
			// for (int i = 0; i < haystackChars.length; i++) {
			// if (needleChars[0] == haystackChars[i]) {
			// index = i;
			// break;
			// }
			// }
			//
			// if (index == -1 || (haystackChars.length - index > needle.length())) {
			// return -1;
			// }
			//
			// for (int j = index + 1; j < haystackChars.length; j++) {
			//
			// }

		}
	}

}
