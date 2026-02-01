import java.util.Scanner;
public class mergeSort {
    static void mS(int arr[],int low, int high){
        if( low >= high) return;

        int mid=(low+high)/2;

        mS(arr, low, mid);  // Left half
        mS(arr, mid+1, high); // Right half
        merge(arr,low,mid,high); // Merge both halves
    }

    static void merge(int arr[],int low,int mid,int high){
        int temp[] = new int[high - low + 1]; // Temporary array // count = high - low + 1 - Formula for count of elements between two indices
        int left = low;
        int right = mid+1;
        int k =0;

        // Compare elements from both halves
        while(left<=mid && right<=high){
            if(arr[left]< arr[right]){
                temp[k++] = arr[left++]; //pehle store hota hai, phir pointer aage badhta hai
            }
            else{
                 temp[k++] = arr[right++];
            }

        }
        // Remaining elements of left half
        while(left<= mid){
                temp[k++] = arr[left++];
        }
        // Remaining elements of right half
        while(right<= high){
                temp[k++] = arr[right++];
        }

        for(int i = 0; i<temp.length; i++){
            arr[low+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.err.println();
        mS(arr,0,n-1);
        System.out.println();
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ "  ");;
        }
    }


}
