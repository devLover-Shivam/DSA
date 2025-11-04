import java.util.Scanner;

public class backtrackReverseNumber {
    static void reverseBackTrack(int i ,int n){
        if(i>n) return;
        reverseBackTrack(i+1, n);
        System.out.println(i);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the last number: ");
    int n = sc.nextInt();
    reverseBackTrack(1, n);
   } 
}
