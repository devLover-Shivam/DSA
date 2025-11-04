import java.util.Scanner;

public class printNumber {

    static void printNumbers(int i, int n){
        if(i>n) return;
        System.out.println(i);
        i++;
        printNumbers(i, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int n = sc.nextInt();
        printNumbers(0, n);
    }
    
}
