import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println(st);

        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();

        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);

        st2.add(5);
        st2.add(6);
        st2.add(3);
        st2.add(4);
        //.retainAll() gives the intersection of two sets like for st1 and st2 , itll return only the common elements in the st1 and st2.
        st1.retainAll(st2);
        System.out.println(st1);
        //.containsAll() returns true or false based on whether a set contains all the elements present inside another set
        System.out.println(st1.containsAll(st2));

    }
}

