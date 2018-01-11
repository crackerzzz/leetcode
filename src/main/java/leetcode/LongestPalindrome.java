package leetcode;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the
 * maximum length of s is 1000.
 * 
 * Example:
 * 
 * Input: "babad"
 * 
 * Output: "bab"
 * 
 * Note: "aba" is also a valid answer. Example:
 * 
 * Input: "cbbd"
 * 
 * Output: "bb"
 * @author shreejwal.shrestha
 *
 */
@RunWith(value = Parameterized.class)
public class LongestPalindrome {
	private final String inputString;
	private final int expedtedOutput;
	private final Solution solution = new Solution();

	@Parameters
	public static Iterable<Object[]> getParameters() {
		return Arrays.asList(new Object[][] { { "babad", "bab" }, { "cbbd", "bb" } });
	}

	public LongestPalindrome(String inputString, int expedtedOutput) {
		this.inputString = inputString;
		this.expedtedOutput = expedtedOutput;
	}

	@Test
	public void testLongest() {
		String output = solution.longestPalindrome(inputString);
		System.out.printf("Testing input: %2s, expected: %s, calculated: %s%n",
				inputString, expedtedOutput, output);
		Assert.assertEquals(expedtedOutput, output);
	}

	static class Solution {
		public String longestPalindrome(String s) {
			return s;
		}

		public boolean isPalindrome(String s) {
			for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
				if (s.charAt(i) != s.charAt(j)) {
					return false;
				}
			}
			return true;
		}
	}
}
