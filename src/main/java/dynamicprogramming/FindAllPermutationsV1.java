package dynamicprogramming;

public class FindAllPermutationsV1 {

	private int counter = 0;

	public void permute(String str) {
		permute("", str);
		System.out.println("Counter: " + counter);
	}

	private void permute(String soFar, String rest) {
		if (rest.isEmpty()) {
			System.out.println(soFar);
		} else {
			for (int i = 0; i < rest.length(); i++) {
				String remaining = rest.substring(0, i) + rest.substring(i + 1);
				System.out.println(i + " -> " + soFar + " -> " + remaining + "->" + rest);
				permute(soFar + rest.charAt(i), remaining);
				counter++;
			}
		}
	}

	public static void main(String[] args) {
		new FindAllPermutationsV1().permute("abcdefghi");
	}

}
