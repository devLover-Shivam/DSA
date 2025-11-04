public class BinarySearch{
    public static void main(String args[]){
        int arr[] = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 28;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index, if found
    // return -1 if the target not found
    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // int mid = (start+end)/2; --> this calculation may exceed the range of int in extreme cases, when the input size of array is very large.

            int mid = start + (end-start)/2; //this is a better way to calculate the mid value without exceeding the range of int.
            if(target<arr[mid]){
                end = mid-1;
            } else if(target > arr[mid]){
                start = mid +1;
            } else {
                return mid; // target element found.
            }
        }

        return -1; // if nothing is returned.

    }
}