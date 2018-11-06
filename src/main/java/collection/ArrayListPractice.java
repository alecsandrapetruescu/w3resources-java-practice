package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> colors = create();

    }

    /**
     * 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
     *
     * @return
     */
    private static List<String> create() {
//        List<String> colors = new ArrayList<>();
//        colors.add("red");
//        colors.add("green");
//        colors.add("blue");
//        return colors;
        return Arrays.asList("red", "green", "blue");
    }

    /**
     * 2. Write a Java program to iterate through all elements in a array list.
     *
     * @param colors
     */
    private static void print(List<String> colors) {
//        colors.forEach(c -> System.out.println(c));
        colors.forEach(System.out::println);
    }

    /**
     * 3. Write a Java program to insert an element into the array list at the first position.
     *
     * @param colors
     * @param color
     */
    private static void addColorAtFirstPosition(List<String> colors, String color) {
        colors.add(0, color);
    }

    /**
     * 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
     *
     * @param colors
     * @param index
     * @return
     */
    private static String getColorByIndex(List<String> colors, int index) {
        return colors.get(index);
    }

    /**
     * 5. Write a Java program to update specific array element by given element.
     *
     * @param colors
     * @param index
     * @param color
     */
    private static void updateColorByIndex(List<String> colors, int index, String color) {
        colors.set(index, color);
    }

    /**
     * 6. Write a Java program to remove the third element from a array list.
     *
     * @param colors
     */
    private static void removeThirdElement(List<String> colors) {
        colors.remove(2);
    }

    /**
     * 7. Write a Java program to search an element in a array list.
     *
     * @param colors
     * @param color
     * @return
     */
    private static boolean hasColor(List<String> colors, String color) {
        return colors.contains(color);
    }

    /**
     * 8. Write a Java program to sort a given array list.
     *
     * @param colors
     * @return
     */
    private static List<String> sort(List<String> colors) {
        Collections.sort(colors);
        return colors;
    }

    /**
     * 9. Write a Java program to copy one array list into another.
     *
     * @param colors
     * @return
     */
    private static List<String> copy(List<String> colors) {
        List<String> newColors = new ArrayList<>();
        Collections.copy(newColors, colors);
        return newColors;
    }

    /**
     * 10. Write a Java program to shuffle elements in a array list.
     *
     * @param colors
     * @return
     */
    private static List<String> shuffle(List<String> colors) {
        Collections.shuffle(colors);
        return colors;
    }

    /**
     * 11. Write a Java program to reverse elements in a array list.
     *
     * @param colors
     * @return
     */
    private static List<String> reverse(List<String> colors) {
        Collections.reverse(colors);
        return colors;
    }

    /**
     * 12. Write a Java program to extract a portion of a array list.
     *
     * @param colors
     * @return
     */
    private static List<String> extract(List<String> colors, int fromIndex, int toIndex) {
        return colors.subList(fromIndex, toIndex);
    }

    /**
     * 13. Write a Java program to compare two array lists.
     */
    private static void compare(List<String> first, List<String> second) {
        List<Boolean> result = new ArrayList<>();
        for (String element : first) {
           result.add(second.contains(element)? true : false);
        }
        System.out.println(result);
    }

    /**
     * 14. Write a Java program of swap two elements in an array list.
     * @param colors
     * @param first
     * @param second
     * @return
     */
    private static List<String> swap(List<String> colors, int first, int second) {
        Collections.swap(colors, first, second);
        return colors;
    }

    /**
     * 15. Write a Java program to join two array lists.
     * @param first
     * @param second
     * @return
     */
    private static List<String> join(List<String> first, List<String> second) {
        List<String> joined = new ArrayList<>();
        joined.addAll(first);
        joined.addAll(second);
        return joined;
    }

    /**
     * 16. Write a Java program to clone an array list to another array list.
     * @param colors
     * @return
     */
    private static List<String> clone(List<String> colors) {
        List<String> cloned =  (List<String>) ((ArrayList) colors).clone();
        return cloned;
    }

    /**
     * 17. Write a Java program to empty an array list.
     * @param colors
     * @return
     */
    private static List<String> empty(List<String> colors) {
        colors.clear();
        return colors;
    }

    /**
     * 18. Write a Java program to test an array list is empty or not.
     * @param colors
     * @return
     */
    private static boolean isEmpty(List<String> colors) {
        return colors.isEmpty();
    }


    /**
     * 19. Write a Java program to trim the capacity of an array list the current list size.
     * @param colors
     * @return
     */
    private static List<String> trim(List<String> colors) {
        ((ArrayList) colors).trimToSize();
        return colors;
    }

    /**
     * 20. Write a Java program to increase the size of an array list.
     * @param colors
     * @param capacity
     */
    private static void increaseSize(List<String> colors, int capacity) {
        ((ArrayList) colors).ensureCapacity(capacity);
    }

    /**
     * 21. Write a Java program to replace the second element of a ArrayList with the specified element.
     * @param colors
     * @param index
     * @param color
     */
    private static void replaceColorByIndex(List<String> colors, int index, String color) {
        colors.set(index, color);
    }

    /**
     * 22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
     * @param colors
     */
    private static void printByIndex(List<String> colors) {
        int noOfElements = colors.size();
        for (int index = 0; index < noOfElements; index++)
            System.out.println(colors.get(index));
    }

}
