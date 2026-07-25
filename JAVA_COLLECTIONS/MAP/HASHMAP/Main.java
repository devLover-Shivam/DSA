import java.util.*;

public class Main{
    public static void main(String[] args) {
        Map<String, String> mpp = new HashMap<>();
        //insertion
        mpp.put("in","india");
        mpp.put("us","united states");
        mpp.put("en","england");
        System.out.println(mpp);

        Map<String, String> mp = new HashMap<>();
        mp.put("br","brazil");
        mp.put("us","united states");
        mp.put("en","england");

       mp.putAll(mpp);
       System.out.println(mp);

       //deletion
       mp.remove("en");
       System.out.println(mp);

       //size
       System.out.println(mp.size());

       //.putIfAbsent(k,v) = insert the key,value if the key is not already assosciated with v.

       mp.putIfAbsent("es", "spain");
       System.out.println(mp);

       //getting an element
       System.out.println(mp.get("br"));

       System.out.println(mp.getOrDefault("po", "none"));

       //checking the key is present or not
       System.out.println(mp.containsKey("in"));

       //checking the value is present or not
       System.out.println(mp.containsValue("india"));

       // replacing a value
       mp.replace("in","indonesia");
       System.out.println(mp);

       //keySet() - returns the set of all the keys in the present
       System.out.println(mp.keySet());
       //entrySet() - returns set of all the key,value mapping present in the map
       System.out.println(mp.entrySet());
    }
}