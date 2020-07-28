package easy;

import org.junit.Assert;
import org.junit.Test;

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;

        // special case
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 0) {
            return -1;
        }

        // right sum
        for (int i : nums) {
            right += i;
        }
        right = right - nums[0];

        if (right == left) {
            return 0;
        }

        for (int j = 1; j < nums.length; j++)
        {
            left = left + nums[j - 1];
            right = right - nums[j];
            if (left == right) {
                return j;
            }
        }
        return -1;
    }

    @Test
    public void test1() {
        int[] test = {1, 7, 3, 6, 5, 6};
        Assert.assertEquals(3, pivotIndex(test));
    }

    @Test
    public void test2() {
        int[] test = {1, 2 ,3};
        Assert.assertEquals(-1, pivotIndex(test));
    }

    @Test
    public void test3() {
        int[] test = {1, 2 ,1};
        Assert.assertEquals(1, pivotIndex(test));
    }

    @Test
    public void test4() {
        int[] test = {1,4};
        Assert.assertEquals(-1, pivotIndex(test));
    }

    @Test
    public void test5() {
        int[] test = {};
        Assert.assertEquals(-1, pivotIndex(test));
    }

    @Test
    public void test6() {
        int[] test = {-1 ,-1 , -1, 0, 1, 1};
        Assert.assertEquals(0, pivotIndex(test));
    }
}
