//Upper Bound = smallest index such that arr[ind] > target.

public class upperBound {
    static int uB(int arr[],int x){
        int low =0, high = arr.length-1,ans=arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,7,8,8,11,11,11,12};
        int ans1 = uB(arr,5);
        System.out.println(ans1);
        int ans2 = uB(arr, 11);
        System.out.println(ans2);
        int ans3 = uB(arr, 12);
        System.out.println(ans3);
    }
}
