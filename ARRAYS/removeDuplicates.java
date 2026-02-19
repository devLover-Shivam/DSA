import java.util.Scanner;

public class removeDuplicates {

    public static int removingDuplicates(int a[], int n) {

        if (n == 0) return 0;

        int i = 0;  // slow pointer

        for (int j = 1; j < n; j++) {  // fast pointer
            if (a[j] != a[i]) {
                i++;
                a[i] = a[j];
            }
        }

        return i + 1;  // total unique elements
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = removingDuplicates(a, n);

        System.out.println("Number of unique elements: " + k);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
