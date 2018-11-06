package collection;

import java.util.*;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("red");
        list.add("green");
        list.add("blue");

//        list = appendAtEnd(list, "white");

//        print(list);

//        printFromPosition(list, 2);

//        printReversed(list);

//        appendAtPosition(list, "yellow", 0);
//        print(list);

//        appendAtFirstAndLast(list, "black", "lila");
//        print(list);

//        appendAtBegining(list, "white");
//        print(list);

//        LinkedList<String> newList = new LinkedList<>();
//        newList.add("yellow");
//        newList.add("black");
//        appendMultipleAtPosition(list, newList, 2);
//        print(list);

//        printFirstAndLastOccurance(list, "green");

//        printElementsAndPosition(list);

//        removeElement(list, "green");
//        print(list);

//        removeFirstAndLast(list);
//        print(list);

//        removeAll(list);
//        print(list);

//        swap(list, 0, 2);
//        print(list);

//        shuffle(list);
//        print(list);

//        join(list, new LinkedList<>());
//        print(list);

//        LinkedList<String> clone = clone(list);
//        print(clone);

//        removeAndPrintFirst(list);

//        printFirst(list);

//        printLast(list);

//        System.out.println(contains(list,"white"));

//        List<String> converted = convertToArrayList(list);
//        System.out.println(converted.toString());

//        compare(list, new LinkedList<>());

        System.out.println("Is list empty: " + isEmpty(list));

        replace(list, "black", 0);
    }


    /**
     * 1. Write a Java program to append the specified element to the end of a linked list.
     *
     * @param list
     * @param element
     * @return
     */
    private static LinkedList<String> appendAtEnd(LinkedList<String> list, String element) {
//        list.add(element);
        list.addLast(element);
        return list;
    }

    /**
     * 2. Write a Java program to iterate through all elements in a linked list.
     *
     * @param list
     */
    private static void print(LinkedList<String> list) {
//        for (String element : list) {
//            System.out.println(element);
//        }
        list.forEach(System.out::println);
    }

    /**
     * 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
     *
     * @param list
     * @param position
     */
    private static void printFromPosition(LinkedList<String> list, int position) {
        Iterator iterator = list.listIterator(position);
        iterator.forEachRemaining(System.out::println);
    }

    /**
     * 4. Write a Java program to iterate a linked list in reverse order.
     *
     * @param list
     */
    private static void printReversed(LinkedList<String> list) {
        Iterator iterator = list.descendingIterator();
        iterator.forEachRemaining(System.out::println);
    }

    /**
     * 5. Write a Java program to insert the specified element at the specified position in the linked list.
     *
     * @param list
     * @param element
     * @param position
     * @return
     */
    private static LinkedList<String> appendAtPosition(LinkedList<String> list, String element, int position) {
        list.add(position, element);
        return list;
    }

    /**
     * 6. Write a Java program to insert elements into the linked list at the first and last position.
     *
     * @param list
     * @param firstElement
     * @param secondElement
     * @return
     */
    private static LinkedList<String> appendAtFirstAndLast(LinkedList<String> list, String firstElement, String secondElement) {
        list.addFirst(firstElement);
        list.addLast(secondElement);
        return list;
    }

    /**
     * 7. Write a Java program to insert the specified element at the front of a linked list.
     *
     * @param list
     * @param element
     * @return
     */
    private static LinkedList<String> appendAtBegining(LinkedList<String> list, String element) {
        list.addFirst(element);
        return list;
    }

    /**
     * 8. Write a Java program to insert the specified element at the end of a linked list. See 1.
     */

    /**
     * 9. Write a Java program to insert some elements at the specified position into a linked list.
     *
     * @param list
     * @param elements
     * @param position
     * @return
     */
    private static LinkedList<String> appendMultipleAtPosition(LinkedList<String> list, LinkedList<String> elements, int position) {
        list.addAll(position, elements);
        return list;
    }

    /**
     * 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
     *
     * @param list
     * @param element
     */
    private static void printFirstAndLastOccurance(LinkedList<String> list, String element) {
        System.out.println("First occurrence: " + list.indexOf(element));
        System.out.println("Last occurrence: " + list.lastIndexOf(element));
    }

    /**
     * 11. Write a Java program to display the elements and their positions in a linked list.
     *
     * @param list
     */
    private static void printElementsAndPosition(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(String.format("Element %s with position: %d", element, list.indexOf(element)));
        }
    }

    /**
     * 12. Write a Java program to remove a specified element from a linked list.
     *
     * @param list
     * @param element
     * @return
     */
    private static void removeElement(LinkedList<String> list, String element) {
        list.remove(element);
    }

    /**
     * 13. Write a Java program to remove first and last element from a linked list.
     *
     * @param list
     * @return
     */
    private static void removeFirstAndLast(LinkedList<String> list) {
        list.removeFirst();
        list.removeLast();
    }

    /**
     * 14. Write a Java program to remove all the elements from a linked list.
     *
     * @param list
     * @return
     */
    private static LinkedList<String> removeAll(LinkedList<String> list) {
        list.clear();
        return list;
    }

    /**
     * 15. Write a Java program of swap two elements in an linked list.
     *
     * @param list
     * @param first
     * @param second
     * @return
     */
    private static List<String> swap(LinkedList<String> list, int first, int second) {
        Collections.swap(list, first, second);
        return list;
    }

    /**
     * 16. Write a Java program to shuffle the elements in a linked list.
     *
     * @param list
     * @return
     */
    private static List<String> shuffle(LinkedList<String> list) {
        Collections.shuffle(list);
        return list;
    }

    /**
     * 17. Write a Java program to join two linked lists.
     *
     * @param first
     * @param second
     * @return
     */
    private static List<String> join(LinkedList<String> first, LinkedList<String> second) {
        LinkedList<String> joined = new LinkedList<>();
        joined.addAll(first);
        joined.addAll(second);
        return joined;
    }

    /**
     * 18. Write a Java program to clone an linked list to another linked list.
     *
     * @param list
     * @return
     */
    private static LinkedList<String> clone(LinkedList<String> list) {
        return (LinkedList<String>) list.clone();
    }

    /**
     * 19. Write a Java program to remove and return the first element of a linked list.
     *
     * @param list
     */
    private static void removeAndPrintFirst(LinkedList<String> list) {
        System.out.println("Removed element: " + list.pop());
    }

    /**
     * 20. Write a Java program to retrieve but does not remove, the first element of a linked list.
     *
     * @param list
     */
    private static void printFirst(LinkedList<String> list) {
        System.out.println("First element:" + list.getFirst());
    }

    /**
     * 21. Write a Java program to retrieve but does not remove, the last element of a linked list.
     *
     * @param list
     */
    private static void printLast(LinkedList<String> list) {
        System.out.println("Last element:" + list.getLast());
    }

    /**
     * 22. Write a Java program to check if a particular element exists in a linked list.
     *
     * @param list
     * @param element
     * @return
     */
    private static boolean contains(LinkedList<String> list, String element) {
        return list.contains(element);
    }

    /**
     * 23. Write a Java program to convert a linked list to array list.
     *
     * @param list
     * @return
     */
    private static List<String> convertToArrayList(LinkedList<String> list) {
        return new ArrayList<>(list);
    }

    /**
     * 24. Write a Java program to compare two linked lists.
     *
     * @param first
     * @param second
     */
    private static void compare(LinkedList<String> first, LinkedList<String> second) {
        LinkedList<Boolean> result = new LinkedList<>();
        for (String element : first) {
            result.add(second.contains(element) ? true : false);
        }
        System.out.println(result);
    }

    /**
     * 25. Write a Java program to test an linked list is empty or not.
     *
     * @param list
     * @return
     */
    private static boolean isEmpty(LinkedList<String> list) {
        return list.isEmpty();
    }

    /**
     * 26. Write a Java program to replace an element in a linked list.
     * @param list
     * @param element
     * @param index
     * @return
     */
    private static LinkedList<String> replace(LinkedList<String> list, String element, int index) {
        list.set(index, element);
        return list;
    }
}
