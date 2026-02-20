/*  we need to find the maximum number of ones that exists consecutively.
eg:- a[] = { 1 0 (1 1 1) 0 0 1}
here the maximum number of ones that exists consecutively = 3 (see the elements inside the bracket)*/

import java.util.Scanner;

public class maximumConsecutiveOnes {

    public static int optimalWay(int a[], int n){
        int cnt = 0;
        int maxi = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1){
                cnt ++;
            }
            else{
                cnt = 0;
            }
            maxi = Math.max(maxi, cnt);
        }

        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = optimalWay(a, n);

        System.out.println("Maximum number of consecutive one's = "+ans);
    }
}
