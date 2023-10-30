package Map;

import java.util.Map;
import java.util.TreeMap;

/*
Binary Search : Concept it will sort in the basis of keys :

 */
public class LearnTreeMAp {
    public static void main(String[] args) {
        Map<String, Integer> tm=new TreeMap<>();
        tm.put("One",1);
        tm.put("Two",2);
        tm.put("Three",3);
        tm.put("A",4);//print in sorted order :

        System.out.println(tm);
        //insert key to remove a key values :
        tm.remove("Two");
        System.out.println(tm);
    }
}
