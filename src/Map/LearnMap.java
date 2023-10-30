package Map;

import java.util.HashMap;
import java.util.Map;

/*
Map : Stores key,values pairs store hota hai!!
TreeMap, HashMap -> imp
To insert the elements into a map : put() Function :

Note * Key always unique but values must be difference :
Note * if we write key as same also it will not be an error
But
it will override the values.

containsKey() :
containsValue() : value is there or not :
isEmpty() : false anf true :


 */
public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Three",4);//override the value//update the values
        System.out.println(map);
        //putIfAbsent() method..
        map.putIfAbsent("Two",23);//it will not be Override
        System.out.println(map);

        //Iterate the Map :
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e);
            //key :
            System.out.println(e.getKey());
            //values :
            System.out.println(e.getValue());
        }
        System.out.println("--------------------");
        //Iteration for keySet :
        for (String s : map.keySet()){
            System.out.println(s);
        }
        System.out.println("--------------------");
        //Iteration for valueSet :
        for (Integer i : map.values()){
            System.out.println(i);
        }
        System.out.println("--------------------");
        //containsValue() :
        boolean b= map.containsValue(4);
        System.out.println(b);
        boolean b1=map.isEmpty();
        System.out.println(b1);
    }
}
