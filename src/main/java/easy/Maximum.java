package easy;

import org.junit.Assert;
import org.junit.Test;

public class Maximum {
    // use library function
    public int maximum(int a, int b) {
        return Math.max(a, b);
    }

    // use math method
    public int maxMath(int a, int b) {
        long c = a;
        long d = b;
        return (int)((Math.abs(c - d) + c + d) / 2);
    }

    @Test
    public void test() {
        int a = 1, b = 2;
        Assert.assertEquals(2, maximum(1, 2));
        Assert.assertEquals(1, maxMath(1, -2));
    }
}
