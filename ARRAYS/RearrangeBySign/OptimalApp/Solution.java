public class Solution {
    
    public int[] rearrangeArray(int[] nums) {

        int ans[] = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[negIndex] = nums[i];
                negIndex +=2;
            }
            else{
                ans[posIndex] = nums[i];
                posIndex+=2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[]= {3,1,-2,-5,2,-4};
        Solution obj = new Solution();
        int result[] = obj.rearrangeArray(nums);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}