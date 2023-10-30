package Set;

import java.util.LinkedHashSet;
/*
 hashSet is not in ordered but linkedHastSet is in Ordered Collections :

 */
public class LearnLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(23);
        lhs.add(43);
        lhs.add(55);
        System.out.println(lhs);
    }
}
