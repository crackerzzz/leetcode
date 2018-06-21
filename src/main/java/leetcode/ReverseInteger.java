package leetcode;

/**
 * @author shreejwal.shrestha
 *
 */
public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(new Solution().reverse(123));;
	}
}


class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while(x != 0) {
            int newRev = rev * 10 + x%10;
            if(newRev/10 != rev) {
                return 0;
            }
            rev = newRev;
            x = x/10;
        }
        return rev;
    }
}