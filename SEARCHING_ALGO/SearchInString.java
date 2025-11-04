import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String name = sc.nextLine();

        System.out.println("Enter the chatacter:");
        char target = sc.next().charAt(0);

        System.out.println(search(name, target));

        
        boolean found = search(name, target);

        if (found) {
            System.out.println("Character '" + target + "' is present in the string.");
        } else {
            System.out.println("Character '" + target + "' is NOT present in the string.");
        }
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i= 0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
