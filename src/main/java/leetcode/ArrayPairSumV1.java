package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSumV1 {

	private int sum(int[] arr, int sum) {

		final Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			Integer el = map.get(arr[i]);
			if (el == null) {
				map.put(arr[i], 1);
			} else {
				map.put(el, el++);
			}
		}

		int count = 0;
		// the count is incremented twice, one for 7 and 3
		for (int i = 0; i < arr.length; i++) {
			if (map.get(sum - arr[i]) != null) {
				count++;
			}
		}
		return count / 2;
	}

	public static void main(String[] args) {
		System.out.println(new ArrayPairSumV1().sum(new int[] { 4, 7, 3, 9, 0, 1 }, 10));
	}

}
