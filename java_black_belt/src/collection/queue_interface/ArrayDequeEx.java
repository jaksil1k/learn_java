package collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst();
        deque.pollLast();
        deque.getLast();
        System.out.println(deque.getFirst());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
