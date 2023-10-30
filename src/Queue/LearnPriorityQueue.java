package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
To give the priority :
Printing : smallest element comes at the first element :
poll : small element priority is greater :
comparator.reverseOrder();
 */
public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(20);
        pq.offer(13);
        pq.offer(45);
        pq.offer(14);
        //smallest element comes at the first element  :
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        int i=pq.peek();
        System.out.println(i);
    }
}
