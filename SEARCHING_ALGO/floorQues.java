public class floorQues {
     public static void main(String args[]){
        int arr[] = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 4;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    //return the index: smallest number >= target
   
    static int floor(int arr[], int target){
        // but what if the target is smaller than the smallest number in the array
        if(target<arr[0]){
            return -1;
        }
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

        return arr[end]; 

    }
}
