package ctci.array_strings;

import java.util.Arrays;

public class IsUniqueExtraDataStructure {

	private boolean isUnique(String str) {
		boolean[] charset = new boolean[256];
		Arrays.fill(charset, false);
		for (char c : str.toCharArray()) {
			if (charset[c] == true) {
				return false;
			}
			charset[c] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new IsUniqueExtraDataStructure().isUnique("abcdefABC1234 ;}"));
	}

}
