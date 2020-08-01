package easy;

import org.junit.Assert;
import org.junit.Test;

public class FindMagicIndexTest {
    // 示例1:
//
//  输入：nums = [0, 2, 3, 4, 5]
// 输出：0
// 说明: 0下标的元素为0
//
//
// 示例2:
//
//  输入：nums = [1, 1, 1]
// 输出：1
//
    FindMagicIndex fmi = new FindMagicIndex();
    @Test
    public void test1()
    {
        int[] nums = {0,2,3,4,5};
        Assert.assertEquals(0, fmi.findMagicIndex(nums));
    }

    @Test
    public void test2()
    {
        int[] nums = {1,1,1};
        Assert.assertEquals(1, fmi.findMagicIndex(nums));
    }
}
