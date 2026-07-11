import java.util.*;

public class Main{
    public static void main(String[] args) {

        //Creating stack
        List<Integer> stacks = new Stack<>();

        //adding elements inside stack
        stacks.add(10);
        stacks.add(20);
        stacks.add(30);
        stacks.add(40);
        stacks.add(50);

        System.out.println(stacks);

        //removing an element from the stack
        stacks.remove(4);

        System.out.println(stacks);

        //addAll = adds element from one stack to another stack

        Stack<Integer> stacks2 =  new Stack<>();
        stacks2.addAll(stacks);
        stacks2.add(5);
        stacks2.add(9);
        stacks2.add(1);
        stacks2.add(3);

        System.out.println(stacks2);

        //sorting a stack
        Collections.sort(stacks2);
        System.out.println("Sorted stacks2"+stacks2);

        //size of a stack
        System.out.println(stacks2.size());

        //STACK SPECIFIC METHODS - SO WE NEED TO TAKE THE REFERENCE OF STACK AND NOT LIST.

        //PUSH() - PUSHES AN ELEMENT AT THE TOP OF THE STACK

        //POP() - REMOVES THE ELEMENT FROM THE TOP OF THE STACK

        //PEEK() - SEE'S THE ELEMENT PRESENT AT THE TOP OF THE STACK

        //SEARCH() - SEARCHES THE ELEMENT AT THE TOP OF THE STACK - returns -1 if not present , if present returns 1

        //EMPTY() - CHECKS WHETHER THE STACK IS EMPTY OR NOT. returns true/false

        stacks2.push(100);
        stacks2.pop();
        System.out.println(stacks2.peek());
        System.out.println(stacks2.search(40));
        System.out.println(stacks2.empty());
        System.out.println(stacks2);


    }
}