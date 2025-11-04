import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int nums[] = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i = 0;i<n;i++){
     nums[i]=sc.nextInt();
    }
    System.out.println("Entered array is :");
    for(int i = 0;i<n;i++){
     System.out.print(nums[i]+" ");
    }
    System.out.println("Enter the element to find: ");
    int target = sc.nextInt();
    System.out.println("Enter the starting index of the range: ");
    int s = sc.nextInt();
    System.out.println("Enter the ending index of the range: ");
    int e = sc.nextInt();

    int ans = linearSearchRange(nums, target,s,e);

    if(ans !=-1){
        System.out.println("Element found at "+ans+ " index");
    } else {
        System.out.println("Element is not in the given array.");
    }
    
}

static int linearSearchRange(int arr[],int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }


}
