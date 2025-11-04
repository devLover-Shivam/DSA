//PRINT NTH FIBONACCI TERM USING MULTIPLE RECURSION CALLS

import java.util.Scanner;

public class multipleRecursionCalls {

    static int f( int i){
        if(i <= 1) return i;

        int last = f(i-1);
        int slast = f(i-2);

        return last+slast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term of fibonnacci you want: ");
        int n = sc.nextInt();
        System.out.println(f(n));

    }
}
