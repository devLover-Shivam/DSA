/* LeetCode 35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4 */


public class SearchInsertPosition {
    static int insertPosition(int arr[],int x){
        int low=0,high=arr.length-1,ans=arr.length;
        while (low<=high) {
            int mid= (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,7,8,8,11,11,11,12};
        int ans1 = insertPosition(arr,5);
        System.out.println(ans1);
        int ans2 = insertPosition(arr, 11);
        System.out.println(ans2);
        int ans3 = insertPosition(arr, 12);
        System.out.println(ans3);
    }
}
