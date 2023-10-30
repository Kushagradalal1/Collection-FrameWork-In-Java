package Queue;

import java.util.ArrayDeque;

/*
DeQueue : From both the side we can insert and delete the elements
are called DeQueue.
offer() : to add the element in the last :
offerLast() : to add the element in the last :
offerFirst() : to add the element at the head :
poll() : first element :
pollFirst() : first element :
pollLast() : last element :

 */
public class LearnArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(12);
        ad.offerFirst(38);
        ad.offerLast(23);
        System.out.println(ad);

        //peek :
        int first=ad.peekFirst();
        System.out.println(first);
        int peek=ad.peek();
        System.out.println(peek);
        int last=ad.peekLast();
        System.out.println(last);
        //pop
        ad.pollLast();
        System.out.println(ad);
    }
}
