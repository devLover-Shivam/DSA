public class introduction {
    static int count = 0; // static variable

    static void countFunction() { // return type void, kyunki kuch return nahi kar rahe
        if (count == 3) {
            return; // base case
        }
        System.out.println(count);
        count++;
        countFunction(); // recursive call
    }

    public static void main(String[] args) {
        countFunction();
    }
}
