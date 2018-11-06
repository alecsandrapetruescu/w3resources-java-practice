package collection;

import java.util.*;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("red");
        set.add("green");
        set.add("blue");

//        appendAtEnd(set, "black");

//        printAll(set);

//        numberOfElements(set);

//        empty(set);
//        printAll(set);

//        System.out.println(String.format("HashSet is empty: %s", isEmpty(set)));

//        Set<String> cloned = clone(set);
//        printAll(cloned);

//        String[] arrayFromSet = convertToArray(set);

//        TreeSet<String> treeSet = convertToTreeSet(set);

//        List<String> list = convertToList(set);

//        System.out.println(String.format("Compared HashSets are : %s", compareTwoSets(set, new HashSet<>())));

//        Set<String> commonElements = getCommonElements(set, new HashSet<>());
//        printAll(commonElements);

//        removeAll(set);
    }


    /**
     * 1. Write a Java program to append the specified element to the end of a hash set.
     *
     * @param set
     * @return
     */
    private static Set<String> appendAtEnd(Set<String> set, String element) {
        set.add(element);
        return set;
    }


    /**
     * 2. Write a Java program to iterate through all elements in a hash list.
     *
     * @param set
     */
    private static void printAll(Set<String> set) {
//        Iterator iterator = set.iterator();
//        iterator.forEachRemaining(System.out::println);
        set.forEach(System.out::println);
    }


    /**
     * 3. Write a Java program to get the number of elements in a hash set.
     *
     * @param set
     * @return
     */
    private static void numberOfElements(Set<String> set) {
        System.out.println(String.format("Number of elements is: %d", set.size()));
    }


    /**
     * 4. Write a Java program to empty an hash set.
     *
     * @param set
     * @return
     */
    private static Set<String> empty(Set<String> set) {
        set.clear();
        return set;
    }


    /**
     * 5. Write a Java program to test a hash set is empty or not.
     *
     * @param set
     * @return
     */
    private static boolean isEmpty(Set<String> set) {
        return set.isEmpty();
    }


    /**
     * 6. Write a Java program to clone a hash set to another hash set.
     *
     * @param set
     * @return
     */
    private static Set<String> clone(Set<String> set) {
        return new HashSet<>(set);

//        Set<String> cloned = new HashSet<>();
//        for (String element : set) {
//            cloned.add(element);
//        }
//        return cloned;

//        Set<String> cloned = new HashSet<>();
//        cloned.addAll(set);
//        return cloned;
    }


    /**
     * 7. Write a Java program to convert a hash set to an array.
     *
     * @param set
     * @return
     */
    private static String[] convertToArray(Set<String> set) {
        return (String[]) set.toArray();
    }


    /**
     * 8. Write a Java program to convert a hash set to a tree set.
     *
     * @param set
     * @return
     */
    private static TreeSet<String> convertToTreeSet(Set<String> set) {
        return new TreeSet<>(set);
    }


    /**
     * 9. Write a Java program to convert a hash set to a List/ArrayList.
     *
     * @param set
     * @return
     */
    private static List<String> convertToList(Set<String> set) {
        return new ArrayList<>(set);
    }

    /**
     * 10. Write a Java program to compare two hash set.
     *
     * @param first
     * @param second
     * @return
     */
    private static boolean compareTwoSets(Set<String> first, Set<String> second) {
        boolean isEqual = false;

//        first.removeAll(second);
//        if (first.isEmpty()) isEqual = true;

        first.retainAll(second);
        if (!second.isEmpty() && first.size() == second.size()) isEqual = true;

        return isEqual;
    }


    /**
     * 11. Write a Java program to compare two sets and retain elements which are same on both sets.
     *
     * @param first
     * @param second
     * @return
     */
    private static Set<String> getCommonElements(Set<String> first, Set<String> second) {
        first.retainAll(second);
        return first;
    }


    /**
     * 12. Write a Java program to remove all of the elements from a hash set.
     *
     * @param set
     * @return
     */
    private static Set<String> removeAll(Set<String> set) {
        set.clear();
        return set;
    }
}
