package firstLastOcurrence;

import java.util.Arrays;

public class optimalSolution {

    static int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int[] searchRange(int[] nums, int target) {
        int lB = lowerBound(nums, target);

        if (lB == nums.length || nums[lB] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lB, upperBound(nums, target) - 1};
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 20, 20, 30, 40, 50};
        int target = 20;

        int[] result = searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }
}