package leetcode.easy;

/**
 * 
 * <pre>
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
 * </pre>
 * 
 * @author shreejwal.shrestha
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arrays = { "abca", "abc" };
		String x = new Solution().longestCommonPrefix(arrays);
		System.out.println(x);
	}

	static class Solution {

		public String longestCommonPrefix(String[] strs) {
			final StringBuilder commonPrefix = new StringBuilder();
			if (strs == null || strs.length == 0) {
				return "";
			}
			final String reference = strs[0];
			outer: for (int i = 0; i < reference.length(); i++) {
				for (int j = 1; j < strs.length; j++) {
					// check if there are sufficient characters in array being checked.
					if (strs[j].length() - 1 < i) {
						break outer;
					}
					if (reference.charAt(i) != strs[j].charAt(i)) {
						break outer;
					}
				}
				commonPrefix.append(reference.charAt(i));
			}
			return commonPrefix.toString();
		}

	}
}
