import java.util.Scanner;

public class moveZerosToEnd {

    // BRUTE FORCE APPROACH
    public static void moveZero(int a[], int n) {

        int temp[] = new int[n];
        int nz = 0;   // non-zero counter

        // 1. Store non-zero elements in temp
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp[nz] = a[i];
                nz++;
            }
        }

        // 2. Copy non-zero elements back
        for (int i = 0; i < nz; i++) {
            a[i] = temp[i];
        }

        // 3. Fill remaining with zeros
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }
    }
    
    // OPTIMAL APPROACH

    public static void moveZeros(int a[], int n) {

    int j = -1;

    // 01. find first zero index
    for (int i = 0; i < n; i++) {
        if (a[i] == 0) {
            j = i;
            break;
        }
    }

    // If no zero found, no need to do anything
    if (j == -1) return;

    // 02. start swapping non-zero elements
    for (int i = j + 1; i < n; i++) {
        if (a[i] != 0) {

            // manual swap
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            j++;
        }
    }
}


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        moveZeros(a, n);  

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        
    }
}
