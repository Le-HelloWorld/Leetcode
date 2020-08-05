package easy;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return nums.length;
        }
        int i = 0;
        int j = 1;
        int count = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[count] = nums[j];
                i = j;
                j = j + 1;
                count = count + 1;
            }
            else {
                j++;
            }
        }
        return count;
    }
}

