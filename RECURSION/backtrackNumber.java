import java.util.Scanner;

public class backtrackNumber {

    static void backTrack(int i, int n){
        if(i<1) return;
        backTrack(i-1, n);
        System.out.println(i);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the last number: ");
    int n = sc.nextInt();
    backTrack(n, n);
   } 
}
