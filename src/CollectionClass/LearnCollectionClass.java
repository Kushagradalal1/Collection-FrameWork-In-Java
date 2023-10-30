package CollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Collections.min() : will return the lowest value number of an arrayList :

 */
public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(100);
        list.add(100);
        System.out.println(list);
        //min
        System.out.println(Collections.min(list));
        //max
        System.out.println(Collections.max(list));
        //frequency
        System.out.println(Collections.frequency(list,100));
        System.out.println("100 is printing {"+Collections.frequency(list,100)+"} Times");
        //sorting :
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
