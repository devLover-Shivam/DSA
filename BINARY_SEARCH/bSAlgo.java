public class bSAlgo {
    static int bS(int arr[], int target){
        int low =0, high = arr.length -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low = mid + 1;
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,5,6,7,8};
        int ans = bS(arr,5);
        System.out.print(ans);
    }
}
