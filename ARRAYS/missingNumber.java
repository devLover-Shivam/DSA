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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // total numbers from 1 to n

        int a[] = new int[n-1]; // array will store only upto 1 to n-1

        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt();
        }

        int missing = bruteMissingNumber(a, n);

        System.out.println("Missing number is: " + missing);

       
    }
}
