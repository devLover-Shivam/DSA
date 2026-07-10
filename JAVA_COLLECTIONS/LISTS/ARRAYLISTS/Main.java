
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
    list.add(40);

    System.out.println(list);


    //removing an element from its index

    list.remove(0);
    System.out.println(list);

    //addAll = pushing all the elements from one arrayList to another.

    arr.add(101);
    arr.add(102);
    list.addAll(arr);
    System.err.println(list);

    //removeAll= removing all elements of a list from another list

    list.removeAll(arr);
    System.out.println(list);

    //size == gives the size of arrayList

    System.out.println(list.size());

    System.out.println(arr);
    //CLEARING OUT ALL THE ELEMENTS OF THE list
    //arr.clear();
    System.out.println(arr.size());

    //Iterator:- standard way to travel across collections
    //hasNext = returns true if the current element has any next element alongwith pointing to the next element.

    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next()+" ");
    }

    //.get = gives the element present at a particular index

    System.out.println(arr.get(0));

    //.set = sets the value at a particular index.
    arr.set(0, 505);
    System.out.println(arr);

    //toArray = converting an arraylist into a array.
    Object[] arry = list.toArray();
    for (Object object : arry) {
        System.out.println(object);
    }

    //contains = checks whether a given element is present inside a list or not

    System.out.println(arr.contains(202));
    }   
}