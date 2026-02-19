import java.util.Scanner;

public class linearSearch {

    public static int lS(int a[],int n,int k){
        for (int i = 0; i < n; i++) {
            if(a[i] == k) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the searching element: ");
        int k = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Element found at "+ lS(a, n, k)+ " th index");
        
    }
}
