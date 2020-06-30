package medium;

import org.junit.Assert;
import org.junit.Test;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        return selectionSort(nums, nums.length)[k - 1];
    }

    public int[] selectionSort(int[] A, int n) {
        int max = 0;
        int t = 0;
        int index = 0;
        while (t < n - 1) {
            max = A[t];
            index = t;
            for (int i = t; i < n; i++) {
                if (max < A[i]) {
                    max = A[i];
                    index = i;
                }
            }
            A[index] = A[t];
            A[t] = max;
            t++;
        }
        return A;
    }

    @Test
    public void test() {
        int[] data1 = {3,2,3,1,2,4,5,5,6};
        int[] data2 = {3,2,1,5,6,4};
        Assert.assertEquals(4, findKthLargest(data1, 4));
        Assert.assertEquals(5, findKthLargest(data2, 2));
    }
}
