//SUM OF N TERMS USING RECURSION IN PARAMETERIZED WAY.

import java.util.Scanner;

public class parameterizedWay {

    static void sumN(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        } 

        sumN(i-1, sum+i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        sumN(n, 0);
    }
}
