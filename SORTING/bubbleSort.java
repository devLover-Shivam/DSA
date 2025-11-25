import java.util.Scanner;
public class bubbleSort {
    static void BubbleSort(int arr[], int n){
        for(int i = n-1;i>=0;i--){
            int didSwap = 0;
            for(int j=0;j<=i-1;j++){
                
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            if(didSwap == 0) break;  
        }
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the arry: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered unsorted array is: ");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        BubbleSort(arr, n);
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

