package easy;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String res = String.valueOf(x);
        String rev = new StringBuffer(res).reverse().toString();
        return res.equals(rev);
    }

    public boolean isPalindromeNum(int x) {
        int res = x;
        int rev = 0;
        while(x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return false;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return false;
            rev = rev * 10 + pop;
        }
        return rev == res;
    }

    @Test
    public void test() {
//        Assert.assertEquals(true, isPalindrome(121));
//        Assert.assertEquals(false, isPalindrome(-121));
//        Assert.assertEquals(false, isPalindrome(10));
        Assert.assertEquals(true, isPalindromeNum(202));
//        Assert.assertEquals(false, isPalindromeNum(-121));
//        Assert.assertEquals(false, isPalindromeNum(10));
    }
}
