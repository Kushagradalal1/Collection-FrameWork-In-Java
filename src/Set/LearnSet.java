package Set;

import java.util.HashSet;
import java.util.Set;

/*
Learn Set :
Duplicates Elements are not allowed :
add(), remove(), contains()
isEmpty(), size()
complexity : O(1)
 */
public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(32);
        set.add(12);
        set.add(45);
        set.add(33);
        set.add(33);
        set.add(65);
        //inside is hashing concept : random elements print ho rahe hai
        //not in ordered way and duplicates elements are not allowed.
        System.out.println(set);
        //remove function :
        set.remove(45);
        System.out.println(set);
        //contains() :
        boolean b1=set.contains(33);
        System.out.println(b1);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        //clear()
        set.clear();
        System.out.println(set);

    }
}
