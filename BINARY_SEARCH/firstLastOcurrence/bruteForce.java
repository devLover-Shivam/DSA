package firstLastOcurrence;

import java.util.Arrays;
public class bruteForce {
    static int[] searchRange(int nums[], int target){
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]== target){
                if(first == -1) first =i;
                last = i;
            }
        }

        return new int[]{first,last};
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 20, 20, 30, 40, 50};
        int target = 20;

        int[] result = searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }
    
}
