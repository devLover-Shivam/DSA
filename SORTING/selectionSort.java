
import java.util.Scanner;
public class selectionSort {

    static void SelectionSort(int arr[], int n){
        for(int i = 0;i <=n-2; i++ ){
            int mini = i;
            for(int j =i; j<=n-1;j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the size of the array: ");
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
        SelectionSort(arr, n);
        System.out.println();
        System.out.print("The sorted array is: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
