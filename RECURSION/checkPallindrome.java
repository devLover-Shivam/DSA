//CHECK IF A GIVEN STRING IS PALLINDROME OR NOT USING RECURSION
import java.util.Scanner;
public class checkPallindrome {

    static boolean isPalindrome(String str, int i){
        int n = str.length();

        //base condition
        if(i>=n/2) return true;

        // agar mismatch mila

        if(str.charAt(i) != str.charAt(n-i-1)) return false;

        return isPalindrome(str, i+1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str= str.toLowerCase(); // case insensitive compare
        System.out.println(isPalindrome(str, 0));
    }
}
