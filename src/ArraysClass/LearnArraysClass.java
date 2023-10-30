package ArraysClass;

import java.util.Arrays;

/*
binarySearch() Method to find the index of the element which is present or not and

return the index of an elements :

sort() Method to sort the arrays elements :

fill() Method to fill the values what you want :

 */
public class LearnArraysClass {
    public static void main(String[] args) {
        int [] arr={4,5,2,3,1};
//        int index= Arrays.binarySearch(arr,4);
//        System.out.println("Index of an element 4 is : "+index);

//        Arrays.sort(arr);
//        for (int a : arr){
//            System.out.print(a+" ");
//        }

        Arrays.fill(arr,4);
        for (int a : arr){
            System.out.print(a +" ");
        }
    }
}
