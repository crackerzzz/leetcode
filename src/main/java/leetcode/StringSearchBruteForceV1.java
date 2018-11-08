package leetcode;

public class StringSearchBruteForceV1 {

	public int search(final char[] haystack, final char[] needle) {
		int count = 0;
		final int M = haystack.length;
		final int N = needle.length;

		int iterations = 0;
		for (int i = 0; i < M - N + 1; i++) {
			int j = 0;
			for (; j < N; j++) {
				iterations++;
				if (needle[j] != haystack[i + j]) {
					break;
				}
			}

			if (j == N) {
				count++;
			}
		}
		System.out.println("Number of iterations: " + iterations);
		return count;
	}

	public static void main(String[] args) {
		final char[] haystack = "deaddeadEyeElephant".toLowerCase()
			.toCharArray();
		final char[] needle = "deadEye".toLowerCase()
			.toCharArray();
		System.out.println(new StringSearchBruteForceV1().search(haystack, needle));
	}
}
