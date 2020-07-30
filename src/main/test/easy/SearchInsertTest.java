package easy;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertTest {
    SearchInsert si;
    int[] a = {1,3,5,6};
    @Test
    public void test1() {
        int target = 5;
        si = new SearchInsert();
        Assert.assertEquals(2, si.searchInsert(a, target));
    }

    @Test
    public void test2() {
        int target = 2;
        si = new SearchInsert();
        Assert.assertEquals(1, si.searchInsert(a, target));
    }

    @Test
    public void test3() {
        int target = 7;
        si = new SearchInsert();
        Assert.assertEquals(4, si.searchInsert(a, target));
    }

    @Test
    public void test4() {
        int target = 0;
        si = new SearchInsert();
        Assert.assertEquals(0, si.searchInsert(a, target));
    }

    @Test
    public void test5() {
        int[] a = {1};
        int target = 2;
        si = new SearchInsert();
        Assert.assertEquals(1, si.searchInsert(a, target));
    }
}
