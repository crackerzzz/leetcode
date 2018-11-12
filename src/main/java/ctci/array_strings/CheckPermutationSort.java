package ctci.array_strings;

import java.util.Arrays;

public class CheckPermutationSort {

	private boolean checkPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		final char[] str1Array = str1.toCharArray();
		final char[] str2Array = str2.toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);

		for (int i = 0; i < str1Array.length; i++) {
			if (str1Array[i] != str2Array[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new CheckPermutationSort().checkPermutation("abcd", "becd"));
	}

}
