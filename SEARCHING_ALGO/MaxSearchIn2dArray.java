import java.util.Arrays;

public class MaxSearchIn2dArray {
    public static void main(String[] args) {
        int arr[][] = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };

        int ans[] = search(arr,target); // format of return value {row,col}
        System.out.println(Arrays.toString(max));
    }

    static int [] max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c] >max){
                    max = arr[r][c];
                }
            }
        }
        return max;
    }
}
