package easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseInt {

    public int reverse(int x) {
        int rev = 0;
        while(x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    @Test
    public void test() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Assert.assertEquals(321, reverse(123));
        Assert.assertEquals(-321, reverse(-123));
        //Assert.assertEquals(120, reverse(21));
        int x = -120;
        int rev = 0;
        while (x!= 0) {
            int pop = x % 10;
            x = x / 10;
            rev = rev * 10 + pop;
            System.out.println("x = " + x + " , rev = " + rev);
        }
    }
}
