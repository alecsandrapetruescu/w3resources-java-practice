package collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();

        /**
         * 1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements
         * of the priority queue.
         */
        queue.add("red");
        queue.add("green");
        queue.add("blue");

        /**
         * 2. Write a Java program to iterate through all elements in priority queue.
         */
        queue.forEach(System.out::println);

        /**
         * 3. Write a Java program to add all the elements of a priority queue to another priority queue.
         */
        PriorityQueue<String> newQueue = new PriorityQueue<>();
        newQueue.addAll(queue);

        /**
         * 4. Write a Java program to insert a given element into a priority queue.
         */
        queue.offer("white");

        /**
         * 5. Write a Java program to remove all the elements from a priority queue.
         */
//        queue.clear();

        /**
         * 6. Write a Java program to count the number of elements in a priority queue.
         */
        System.out.println(String.format("Number of elements in queue: %d", queue.size()));

        /**
         * 7. Write a Java program to compare two priority queues.
         */
        for (String element : queue) {
            System.out.println(String.format("Element %s contained %s", element, newQueue.contains(element) ? true : false));
        }

        /**
         * 8. Write a Java program to retrieve the first element of the priority queue.
         */
        System.out.println(String.format("Retrieve the first element of the priority queue: %s", queue.peek()));

        /**
         * 9. Write a Java program to retrieve and remove the first element.
         */
        System.out.println(String.format("Retrieve and remove the first element: %s", queue.poll()));

        /**
         * 10. Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
         */
        Object[] arrayFromQueue = queue.toArray();

        /**
         * 11. Write a Java program to convert a Priority Queue elements to a string representation.
         */
        String stringFromQueue = queue.toString();

        /**
         * 12. Write a Java program to change priorityQueue to maximum priorityqueue.
         */
        PriorityQueue<String> maxPriority = new PriorityQueue<>(10, Collections.reverseOrder());
        maxPriority.addAll(queue);

    }



    
}
