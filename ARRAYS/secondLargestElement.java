import java.util.Scanner;
public class secondLargestElement{
     // OPTIMAL APPROACH //
    public static int secondLargest(int a[], int n){

        int largest = a[0];
        int sLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                sLargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>sLargest){
                sLargest = a[i];
            }
        }

        return sLargest;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int a[] = new int[n];

    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }

    System.out.println("The second largest element of the given array is: "+ secondLargest(a, n));

}

}