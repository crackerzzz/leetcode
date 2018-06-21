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
public class LongestCommonPrefixDivideNConquer {

	public static void main(String[] args) {
		String[] arrays = { "abca", "abc" };
		String x = new Solution().longestCommonPrefix(arrays);
		System.out.println(x);
	}

	static class Solution {

		public String longestCommonPrefix(String[] strs) {
			return divideNConquer(strs, 0, strs.length - 1);
		}

		public String divideNConquer(String[] strs, int l, int r) {
			if (l == r) {
				return strs[l];
			} else {
				final int mid = (l + r) / 2;
				final String left = divideNConquer(strs, l, mid);
				final String right = divideNConquer(strs, mid + 1, r);
				return commonPrefix(left, right);
			}
		}

		public String commonPrefix(String left, String right) {
			final int min = Math.min(left.length(), right.length());
			for (int i = 0; i < min; i++) {
				if (left.charAt(i) != right.charAt(i)) {
					return left.substring(0, i);
				}
			}
			return left.substring(0, min);
		}

	}
}
