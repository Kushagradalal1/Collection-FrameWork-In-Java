package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
FIFO : rear -> insert the element and front -> delete the element or remove the elements.
//To insert the element in the Queue : offer() method : add() function is also there..
//poll : to remove the element : poll() method : remove() function is also there..
//peek : which element is next in line to remove : peek() method : we also have element() function

 */
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        //LinkedList is implementing the Queue Interface :

        Queue<Integer> queue=new LinkedList<>();
        //offer()
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        System.out.println(queue);
        //poll()
        System.out.println(queue.poll());
        System.out.println(queue);
        //peek() //next element to pop :
        int i=queue.peek();
        System.out.println(i);

    }
}
