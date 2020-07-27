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

        // right sum
        for (int i : nums) {
            right += i;
        }
        right = right - nums[0];

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
    public void test() {
        int[] test1 = {1, 7, 3, 6, 5, 6};
        int[] test2 = {1, 2 ,3};
        int[] test3 = {1, 2 ,1};
        int[] test4 = {1, 4};
        Assert.assertEquals(3, pivotIndex(test1));
        Assert.assertEquals(-1, pivotIndex(test2));
        Assert.assertEquals(1, pivotIndex(test3));
        Assert.assertEquals(-1, pivotIndex(test4));
    }
}
