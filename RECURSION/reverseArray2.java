import java.util.Scanner;

public class reverseArray2 {

    // Recursive function to reverse array using two pointers
    static void reverseArray(int[] arr, int l, int r) {
        // Base case: when pointers cross each other, stop recursion
        if (l >= r) return;

        // Swap elements
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        // Recursive call for next pair
        reverseArray(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array recursively
        reverseArray(arr, 0, n - 1);

        // Print reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
