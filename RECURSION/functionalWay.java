import java.util.Scanner;
public class functionalWay {

    static int sumN(int i){
        if(i == 0) return 0;
        return i + sumN(i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println(sumN(n));
    }
}
