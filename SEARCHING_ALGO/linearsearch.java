public class linearsearch {
    
    public static void main(String[] args){

        int nums[] = {12,15,85,96,36};
        int target = 5;
        int ans = linearSearch(nums, target);
        System.out.println("Element found at "+(ans)+" th index.");

    }

    //search for the element in the array and return the index of the element
    //otherwise if the element is not found return -1

    static int linearSearch(int arr[],int target){

        if(arr.length == 0){
            return -1;
        }

        for (int i=0;i<arr.length;i++){
            //check for element at every index 
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

}
