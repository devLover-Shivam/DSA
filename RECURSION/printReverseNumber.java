import java.util.Scanner;

public class printReverseNumber {
    static void reverseNumber(int i,int n){
        if(i<1)return;
        System.out.println(i);
        i--;
        reverseNumber(i, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        reverseNumber(n, n);
    }
}
