package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.offer("Mariya");
        queue.offer("Alexandr");
        System.out.println(queue);
        System.out.println(queue.remove());
        // if queue is empty returns null
        queue.poll();

        System.out.println(queue.element());
        //if not element exists returns null
        queue.peek();
    }
}
