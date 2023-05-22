package collection.queue_interface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        System.out.println(priorityQueue);
    }
}
