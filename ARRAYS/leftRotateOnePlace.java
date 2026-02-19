//LEFT ROTATING THE ARRAY BY ONE PLACE

import java.util.Scanner;

public class leftRotateOnePlace {

    public static void leftRotate(int a[],int n){
        int temp = a[0];
        for (int i = 1; i < n; i++) {
            a[i-1] = a[i];
        }
        a[n-1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        leftRotate(a, n);

        System.out.println("After rotating the array by one place: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
