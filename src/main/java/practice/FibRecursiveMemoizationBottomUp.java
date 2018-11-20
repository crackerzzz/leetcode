package practice;

import java.util.Arrays;

public class FibRecursiveMemoizationBottomUp {
	static long[] cache;

	public static void main(String[] args) {
		int n = 90;

		initializeCache(n);

		for (int i = 0; i < n; i++) {
			System.out.println(i + " => " + fib(i));
		}
	}

	private static void initializeCache(int n) {
		cache = new long[n + 1];
		Arrays.fill(cache, -1);
		cache[0] = 0;
		cache[1] = 1;
	}

	public static long fib(int n) {
		return fibMemo(n, cache);
	}

	public static long fibMemo(int n, long[] cache) {
		if (cache[n] != -1) {
			return cache[n];
		}
		long sum = fib(n - 1) + fib(n - 2);
		cache[n] = sum;
		return sum;
	}
}
