import java.util.Scanner;

public class insertionSort {

    static void InsertionSort(int arr[], int n){
        for(int i = 0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+n+" elements: ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("The entered unsorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        InsertionSort(arr, n);
        System.out.println();
        System.out.print("The sorted array is: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
