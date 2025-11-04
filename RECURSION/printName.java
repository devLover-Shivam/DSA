//PRINT NAME N TIMES USING RECURSION!

import java.util.Scanner;

public class printName {

    static void printNames(int i, int n){
        if(i>n) return; //base condition
        System.out.println("Shivam" + i);
        i++;
        printNames(i, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print your name: ");
        int n = sc.nextInt();
        printNames(1, n);

    }
}
