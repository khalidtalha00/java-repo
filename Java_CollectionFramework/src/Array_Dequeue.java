import java.util.ArrayDeque;

public class Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(14);
        adq.offerFirst(78); // add 78 to the first position
        adq.offerLast(2);  // add 2 to the last position
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst()); // peeks the first element
        System.out.println(adq.peekLast()); // peeks the last element

        System.out.println(adq.poll());  // deletes the element 78
        System.out.println(adq.pollFirst()); // delete the first element
        System.out.println(adq.pollLast());  // deletes the last element

        System.out.println(adq);
    }
}
