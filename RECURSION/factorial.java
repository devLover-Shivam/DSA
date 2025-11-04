// Print the factorial of a number n using recursion.
import java.util.Scanner;

public class factorial {
    static int f(int i){
        if(i<=1) return 1;
        return i*f(i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}
