package ARRAYLISTS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List or Collections - > interfaces
    //ArrayList -> concrete class

    ArrayList<Integer> list = new ArrayList<>();
    //OTHER WAYS TO IMPLEMENT ARRAY LIST:-
    List<Integer> arr = new ArrayList<>();
    Collection<Integer> array = new ArrayList<>();

    //AADDING ELEMENTS INSIDE THE ARRAYLIST:-

    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println(list);
    }
    
}