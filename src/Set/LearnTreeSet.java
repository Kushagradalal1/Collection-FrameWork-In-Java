package Set;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet : unique elements and its in binary search form in sorted form :

 */
public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> ts=new TreeSet<>();
        ts.add(23);
        ts.add(12);
        ts.add(2);
        ts.add(16);
        ts.add(100);
        //printing the elements in sorted manner and print the unique elements :

        System.out.println(ts);
    }
}
