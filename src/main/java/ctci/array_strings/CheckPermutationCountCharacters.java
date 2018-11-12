package ctci.array_strings;

import java.util.Arrays;

public class CheckPermutationCountCharacters {

	private boolean checkPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		final int[] counter = new int[256];
		Arrays.fill(counter, 0);

		for (int i = 0; i < str1.length(); i++) {
			counter[str1.charAt(i)]++;
			counter[str2.charAt(i)]--;
		}

		for (int count : counter) {
			if (count > 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new CheckPermutationCountCharacters().checkPermutation("abcd", "bacd"));
	}

}
