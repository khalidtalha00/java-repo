import java.util.LinkedList;
import java.util.Queue;


// in case of que we add data from the rear and delete from the front


public class Queue_inJava {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>(); // here we are implementing queue using linkedlist we can also do so by using arraylist

        myQueue.offer(1); // addimg element to the queue we csn also use the add() method but that will throw error if element is not added.
        myQueue.offer(14);
        myQueue.offer(16);
        myQueue.offer(51);
        System.out.println(myQueue);

        myQueue.poll(); // removes the element from the front so 1 will be removes
        System.out.println(myQueue);

        System.out.println(myQueue.peek()); // displays the front of the queue

    }
}
