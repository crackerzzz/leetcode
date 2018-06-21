package leetcode.easy;

/**
 * @author shreejwal.shrestha
 *
 */
public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(101));
		;
	}

	static class Solution {
		public boolean isPalindrome(int x) {
			if (x < 0) {
				return false;
			}
			return x == getReversal(x);
		}

		public int getReversal(int x) {
			int rev = 0;
			while (x != 0) {
				int newRev = rev * 10 + x % 10;
				if (newRev / 10 != rev) {
					return 0;
				}
				rev = newRev;
				x = x / 10;
			}
			return rev;
		}
	}
}
