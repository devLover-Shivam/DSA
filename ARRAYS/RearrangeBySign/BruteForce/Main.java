import java.util.*;

public class Main{

    public int[] rearrangeSign(int nums[]){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int n =  nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }

        for (int i = 0; i <n; i++) {
            if(i%2==0){
                nums[i] = pos.get(i/2);

            }else{
                nums[i] = neg.get(i/2);
            }
        }

        return nums;

    }
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int n =nums.length;

        Main obj = new Main();
        int[] result = obj.rearrangeSign(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}