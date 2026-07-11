//KADANE'S ALGORITHM

public class Main {

    static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum +nums[i];
            if(sum > maxi){
                maxi =sum;
            }
            if(sum<0){
                sum = 0;
            }
        }

        return maxi;
    }

     public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int ans = maxSubArray(arr);
        System.out.println(ans);
     }
}