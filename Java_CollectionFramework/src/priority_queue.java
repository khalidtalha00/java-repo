import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // priority que implements min heap

        pq.offer(34); // add element
        pq.offer(1);
        pq.offer(12);
        pq.offer(78);
        System.out.println(pq);  // prints elements acording to min heap

        pq.poll();
        System.out.println(pq);  // will delete the most minimum element
        System.out.println(pq.peek());

    }
}
