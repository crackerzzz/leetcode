package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/***
 * Given a string, find the length of the longest substring without repeating characters.
 * 
 * Examples:
 * 
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * 
 * Given "bbbbb", the answer is "b", with the length of 1.
 * 
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be
 * a substring, "pwke" is a subsequence and not a substring.
 * 
 * Given "abadecbb", the answer is "abc", which the length is 3.
 * 
 * @author shreejwal.shrestha
 *
 */
@RunWith(value = Parameterized.class)
public class LongestSubstrWithoutRepeatingChars {
	private final String inputString;
	private final int expedtedOutput;
	private final InnerClass inner = new InnerClass();

	@Parameters
	public static Iterable<Object[]> getParameters() {
		return Arrays.asList(new Object[][] { { "abcabcbb", 3 }, { "bbbbb", 1 },
				{ "pwwkew", 3 }, { "pwwpkew", 4 }, { "abadecbb", 5 } });
	}

	public LongestSubstrWithoutRepeatingChars(String inputString, int expedtedOutput) {
		this.inputString = inputString;
		this.expedtedOutput = expedtedOutput;
	}

	@Test
	public void testLongest() {
		int output = inner.lengthOfLongestSubstring(inputString);
		System.out.printf("Testing input: %2s, expected: %s, calculated: %s%n",
				inputString, expedtedOutput, output);
		Assert.assertEquals(expedtedOutput, output);
	}

	static class InnerClass {
		public int lengthOfLongestSubstring(String s) {
			int current_len = 0, max_length = 0;
			String current_nrcs = "";
			Set<Character> visited = new HashSet<>();
			for (int i = 0; i < s.toCharArray().length; i++) {
				final char c = s.charAt(i);
				if (!visited.contains(c)) {
					visited.add(c);
					current_len++;
					max_length = Math.max(max_length, current_len);
					current_nrcs = current_nrcs.concat(c + "");
				}
				else {
					int index = current_nrcs.indexOf(c);
					current_nrcs = current_nrcs
						.substring(index + 1, current_nrcs.length())
						.concat(c + "");
					current_len = current_nrcs.length();
//					visited.clear();
//					for (char x : current_nrcs.toCharArray()) {
//						visited.remove(x);
//					}
				}
			}
			return max_length;
		}
	}

}
