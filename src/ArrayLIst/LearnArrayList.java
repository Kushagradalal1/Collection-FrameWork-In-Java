package ArrayLIst;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        //dynamic array we have an arraylist :
        //add() : it will add the element at the last position.
        //add(int index, int element) : it will at the element to the specific position add.
        //addAll() : Copy one list to the other list
        //get(pass the idx) : to get the elements.
        //remove(pass the idx) : to remove the elements.
        //Remove element : remove(Integer.valueOf("D")
        //clear() : to remove whole list. {return empty list}
        //remove O(n) time complexity..
        //set : to set the element
        //contains : element is present or not : true and false return bool this method is

        ArrayList<String> studentsName=new ArrayList<>();
        studentsName.add("A");
        studentsName.add("B");
        studentsName.add("C");
        studentsName.add("D");
        System.out.println(studentsName);
        //iterate with the help of for loop :
//        for (int i=0; i<studentsName.size(); i++){
//            System.out.println(studentsName.get(i));
//        }
//        //how to iterate the element of the list :
//        for (String is : studentsName){
//            System.out.println(is);
//        }
        //Iterator interface :
        Iterator<String> it= studentsName.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        ArrayList<String> newStudentName=new ArrayList<>();
//        newStudentName.add("E");
//        newStudentName.add("F");
//        // addAll function
//        //studentsName.addAll(newStudentName);
//        //System.out.println(studentsName);
//        System.out.println(studentsName.get(3));
//        studentsName.remove(1);
//        System.out.println(studentsName);
//        studentsName.remove(String.valueOf('D'));
////        System.out.println(studentsName);
////        studentsName.clear();
//        System.out.println(studentsName);
//        studentsName.set(1,"Kushagra");
//        System.out.println(studentsName);
//        boolean b=studentsName.contains("Kushagra");
//        System.out.println(b);
    }
}
