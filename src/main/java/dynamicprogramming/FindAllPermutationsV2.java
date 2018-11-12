package dynamicprogramming;

/***
 * https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 * 
 * @author shreejwal.shrestha
 *
 */
public class FindAllPermutationsV2 {
	private int counter = 0;

	public void permute(String str) {
		permute(str, 0, str.length() - 1);
		System.out.println("Counter: " + counter);
	}

	private void permute(String str, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			System.out.println(str);
		} else {
			for (int i = startIndex; i <= endIndex; i++) {
				str = swap(str, startIndex, i);
				System.out.println("first swap str: " + str);
				permute(str, startIndex + 1, endIndex);
				// bring back original string
				str = swap(str, startIndex, i);
				System.out.println("second swap str: " + str);
				counter++;
			}
		}
	}

	private String swap(String str, int i, int j) {
		if (i == j) {
			return str;
		}
		char[] chrs = str.toCharArray();
		char temp = chrs[i];
		chrs[i] = chrs[j];
		chrs[j] = temp;
		return String.valueOf(chrs);
	}

	public static void main(String[] args) {
		new FindAllPermutationsV2().permute("abc");
	}

}
