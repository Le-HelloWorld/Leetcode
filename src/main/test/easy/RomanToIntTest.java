package easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntTest {
    RomanToInt rti = new RomanToInt();
    @Test
    public void test1() {
        Assert.assertEquals(3, rti.romanToInt("III"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(4, rti.romanToInt("IV"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(9, rti.romanToInt("IX"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(58, rti.romanToInt("LVIII"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(1994, rti.romanToInt("MCMXCIV"));
    }
}
