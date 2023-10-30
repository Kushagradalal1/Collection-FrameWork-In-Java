package ArrayLIst;

import java.util.Stack;
/*
Push : to insert the elements in the stack :
peek : to check the element in the top :
Pop : to remove the tp element :

 */
public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();
        animals.push("dog");
        animals.push("lion");
        animals.push("cat");
        animals.push("tiger");
        System.out.println(animals);
        //peek element :
        String peek=animals.peek();
        System.out.println(peek);
        //top element to pop :
        animals.pop();
        System.out.println(animals);
        System.out.println(animals.peek());
    }
}
