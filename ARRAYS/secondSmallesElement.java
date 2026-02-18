import java.util.Scanner;


public class secondSmallesElement {

    public static int secondSmallest(int a[],int n){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<smallest){
                ssmallest =smallest;
                smallest = a[i];
            }
            else if(a[i]>smallest && a[i]<ssmallest){
                ssmallest =a[i];
            }
        }
        return ssmallest;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The second smallest element of the given array is: "+ secondSmallest(a, n));
    }
}
