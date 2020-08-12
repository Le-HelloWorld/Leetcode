package easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    LongestCommonPrefix lcp = new LongestCommonPrefix();
    @Test
    public void test1() {
        String[] strs = {"flower","flow","flight"};
        Assert.assertEquals("fl", lcp.longestCommonPrefix(strs));
    }

    @Test
    public void test2() {
        String[] strs = {"dog","racecar","car"};
        Assert.assertEquals("", lcp.longestCommonPrefix(strs));
    }
}
