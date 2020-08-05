package easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    RemoveDuplicates rd = null;
    // 给定数组 nums = [1,1,2],
    // 给定 nums = [0,0,1,1,1,2,2,3,3,4],
    @Test
    public void test1() {
        int[] nums  = {1, 1, 2};
        rd = new RemoveDuplicates();
        int len = rd.removeDuplicates(nums);
        Assert.assertEquals(2, len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void test2() {
        int[] nums  = {0,0,1,1,1,2,2,3,3,4};
        rd = new RemoveDuplicates();
        int len = rd.removeDuplicates(nums);
        Assert.assertEquals(5, len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void test3() {
        int[] nums  = {1,2,3};
        rd = new RemoveDuplicates();
        int len = rd.removeDuplicates(nums);
        Assert.assertEquals(3, len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
