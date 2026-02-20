/* here we're finding the number that appears only once while the other numbers appears twice.
eg : a[] = { 1 1 2 2 3 4 4 5 5}
so, the number that appears only once is 3 and every other elements of array 'a' are occuring twice. */

import java.util.Scanner;

public class findNUmberOccuringOnce {

    public static int optimalWay(int a[], int n){
        int XOR1 = 0;
       
        for (int i = 0; i < n; i++) {
            XOR1 = XOR1 ^ a[i];
        }

        return XOR1;
    }
    
    public static int bruteForce(int a[], int n){

    for (int i = 0; i < n; i++) {

        int cnt = 0;
        int num = a[i];

        for (int j = 0; j < n; j++) {
            if (a[j] == num) {
                cnt++;
            }
        }

        if (cnt == 1) {
            return num;
        }
    }

    return -1;   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        /* int ans = optimalWay(a,n); */
        int ans = bruteForce(a, n);
        System.out.println("Element that appears only once = "+ans);
    }
}
