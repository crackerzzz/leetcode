package ctci.array_strings;

import java.util.Arrays;

public class PalindromePermutation {

	private boolean checkPermute(char[] charArray) {
		final int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

		Arrays.fill(table, 0);

		int oddCount = 0;

		for (int i = 0; i < charArray.length; i++) {
			int x = getCharNumber(charArray[i]);
			if (x != -1) {
				table[x]++;

				if (table[x] % 2 == 1) {
					oddCount++;
				} else {
					oddCount--;
				}
			}
		}

		return oddCount <= 1;
	}

	private int getCharNumber(char c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');

		int val = Character.getNumericValue(c);

		if (a <= val && val <= z) {
			return val - a;
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(new PalindromePermutation().checkPermute("Tact Cao".toLowerCase()
			.toCharArray()));
	}

}
