package easy;

public class FindMagicIndex {
    public int findMagicIndex(int[] nums) {

        return method1(nums);
    }

    /**
     * 方法1：枚举法
     * @param nums 数据源
     * @return 索引最小值
     */
    private int method1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
