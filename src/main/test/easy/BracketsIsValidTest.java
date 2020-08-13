package easy;

import org.junit.Assert;
import org.junit.Test;

public class BracketsIsValidTest {
    BracketsIsValid biv = new BracketsIsValid();
    @Test
    public void test1() {
        Assert.assertTrue(biv.isValid("()"));
    }

    @Test
    public void test2() {
        Assert.assertTrue(biv.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        Assert.assertFalse(biv.isValid("(]"));
    }

    @Test
    public void test4() {
        Assert.assertFalse(biv.isValid("([)]"));
    }

    @Test
    public void test5() {
        Assert.assertTrue(biv.isValid("{[]}"));
    }

}
