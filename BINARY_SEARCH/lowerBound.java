//Lower Bound = smallest index such that arr[ind] >= target.
public class lowerBound {
    static int lB(int arr[], int x){
        int low =0;
        int high = arr.length-1;
        int ans = arr.length;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]>=x) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
   public static void main(String[] args) {
    int arr[] = {1,2,4,5,5};
        int ans = lB(arr,10);
        System.out.print(ans);
   } 
}
