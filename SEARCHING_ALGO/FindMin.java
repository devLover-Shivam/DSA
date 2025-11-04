public class FindMin {
    public static void main(String[] args) {
        int nums[] = {23,45,67,80,9};
        System.out.println(searchMin(nums));

    }

    static int searchMin(int arr[]){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
