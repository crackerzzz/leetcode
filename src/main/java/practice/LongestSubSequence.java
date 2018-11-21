package practice;

import java.util.Arrays;

public class LongestSubSequence {
	public static void main(String[] args) {
		System.out.println(getLongestSubSequence("templesaylmg".toLowerCase()));
	}

	public static String getLongestSubSequence(String str) {

		// handle edge case scenario
		if (str.length() == 1) {
			return str;
		}

		final int[] cache = new int[128];
		Arrays.fill(cache, -1);

		int maxLength = 0;

		final int[] result = new int[2];

		int start = 0, current = 0;
		while (current < str.length()) {
			final int convertedIndex = str.charAt(current);

			// check if character has already been visited
			if (cache[convertedIndex] == -1) {

				// note the character's index in the string
				cache[convertedIndex] = current;
				current++;
			} else {

				// character has repeated, check the length. If the length is more that previous
				// length, this becomes the longest one. also keep track of the indices.
				final int previous = current - 1;
				final int newLength = previous - start + 1;
				if (maxLength < newLength) {
					// track new max sub sequence
					maxLength = newLength;
					result[0] = start;
					result[1] = previous;

					// move start pointer to current and restart from thereon
					start = current;

					// reset the cache as well???
					Arrays.fill(cache, -1);
				} else {
					// ignore and continue with next character.
					current++;
				}

			}
		}

		return str.substring(result[0], result[1] + 1);
	}
}
