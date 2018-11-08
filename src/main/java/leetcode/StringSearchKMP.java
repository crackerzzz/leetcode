package leetcode;

public class StringSearchKMP {

	public int search(final char[] haystack, final char[] needle) {
		int count = 0;
		final int M = haystack.length;
		final int N = needle.length;

		for (int i = 0; i < M - N + 1;) {
			int j = 0;
			for (; j < N; j++) {
				if (needle[j] != haystack[i + j]) {
					break;
				}
			}

			if (j == N) {
				count++;
				// for matches skip by length of needle or pattern, incre
				i += N;
			} else {
				// for no matches start comparing at next index i.e. i+1
				i++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		final char[] haystack = "deadedeadeye".toLowerCase()
			.toCharArray();
		final char[] needle = "deadeye".toLowerCase()
			.toCharArray();
		System.out.println(new StringSearchKMP().search(haystack, needle));
	}
}
