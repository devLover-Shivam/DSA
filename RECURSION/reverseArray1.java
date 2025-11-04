import java.util.Scanner;

public class reverseArray1 {

    static void reverseArray(int arr[], int i,int n){
        if(i >= n/2) return;

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] =  temp;

        reverseArray(arr, i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
         System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverseArray(arr, 0, n);
        System.out.println("Reversed Array is: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
}
