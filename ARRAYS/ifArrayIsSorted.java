import java.util.Scanner;

public class ifArrayIsSorted {
    
    public static boolean isSorted(int a[], int n){
        for (int i = 1; i < n; i++) {
            if(a[i]>a[i-1]){

            }
            else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Is the given array sorted ?" + isSorted(a, n));
    }


}
