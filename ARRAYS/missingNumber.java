import java.util.Scanner;

public class missingNumber {

    public static int bruteMissingNumber(int a[], int n){

        for (int i = 1; i <= n; i++) {

            int flag = 0;

            for (int j = 0; j < n-1; j++) {
                if(a[j] == i){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0)
                return i;
        }

        return -1;  
    }

    public static int sumOptimalApproach(int a[], int n){
        int sum = (n*(n+1))/2;

        int s2 = 0;

        for (int i = 0; i < n-1; i++) {
            s2 = s2 + a[i];
        }

        return (sum - s2);
    }

    public static int xorOptimalApproach(int a[], int n){

    int XOR1 = 0;
    int XOR2 = 0;

    for (int i = 0; i < n-1; i++) {
        XOR2 = XOR2 ^ a[i];
        XOR1 = XOR1 ^ (i+1);
    }

    XOR1 = XOR1 ^ n;

    return XOR1 ^ XOR2;
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // total numbers from 1 to n

        int a[] = new int[n-1]; // array will store only upto 1 to n-1

        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt();
        }

        /* int missing = bruteMissingNumber(a, n); */

        /* int missing = sumOptimalApproach(a, n); */

        int missing = xorOptimalApproach(a, n);

        System.out.println("Missing number is: " + missing);

       
    }
}
