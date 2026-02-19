//ROTATING ARRAY TO THE LEFT BY D PLACES

import java.util.Scanner;
public class leftRotateDPlaces {
    
    public static void leftRotate(int a[], int n, int d){
        d= d%n; //effective number of rotations

       
        // BRUTE FORCE APPROACH
        
        int[] temp = new int[d];


        // storing the rotated elements of array in the temporary array.
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        // for shifting the rest elements.
        for (int i = d; i < n; i++) {
            a[i-d] = a[i];
        }
        // now putting back the temporary array.
        for (int i = n-d; i < n; i++) {
            a[i] = temp[i-(n-d)];
        }

    }
    
    //OPTIMAL WAY FOR ROTATING THE ARRAY BY D PLACES TO THE LEFT.
    public static void reverse(int a[],int sp, int ep){
        while(sp<ep){
                int temp = a[sp];
                a[sp] = a[ep];
                a[ep] = temp;
                sp++;
                ep--;
            }
    }

    public static void leftRotateUsingReversal(int a[],int n,int d){
        if (n == 0) return;
        d = d % n;
        if (d < 0) d += n;
        // reverse first d, then remaining, then whole array
        reverse(a, 0, d - 1);
        reverse(a, d, n - 1);
        reverse(a, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of rotations by left: ");
        int d = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        leftRotateUsingReversal(a, n, d);
        System.out.println("After rotation array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
