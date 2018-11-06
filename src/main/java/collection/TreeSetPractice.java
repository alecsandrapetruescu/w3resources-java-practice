package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        Set<String> set = create();
        print(set);

//        Set<String> anotherSet = addToAnother(set);
//
//        Set<String> reversed = revers((TreeSet<String>) set);
//
//        getFirstAndLast((TreeSet<String>) set);
//
//        Set<String> cloned = clone(set);
//
//        System.out.println(String.format("Number of elements of a set are: %d", getNumberOfElements(set)));
//
//        System.out.println(String.format("Compared sets are %s", compare(set, new HashSet<>())));

//        Set<Integer> integerSet = create(10);
//        Set<Integer> newIntSet = findNumbersLessThan((TreeSet<Integer>) integerSet, 7);
//        print(newIntSet);
//
//        System.out.println(String.format("Element greater or equal than %d is %d", 2, findElementGreaterOrEqual((TreeSet<Integer>)integerSet, 2)));
//
//        System.out.println(String.format("Element less or equal than %d is %d", 2, findElementLessOrEqual((TreeSet<Integer>)integerSet, 2)));
//
//        System.out.println(String.format("Element strictly grater than %d is %d", 2, findElementStrictlyGreater((TreeSet<Integer>)integerSet, 2)));
//
//        System.out.println(String.format("Element strictly less than %d is %d", 2, findElementStrictlyLess((TreeSet<Integer>)integerSet, 2)));

        System.out.println(String.format("Retrive and remove first element %s", retriveAndRemoveFirst((TreeSet<String>) set)));

        System.out.println(String.format("Retrive and remove last element %s", retriveAndRemoveLast((TreeSet<String>) set)));

        System.out.println(String.format("Remove element %s, result is %s", "green", remove(set, "green").toString()));
    }

    /**
     * 1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
     *
     * @return
     */
    private static Set<String> create() {
        Set<String> set = new TreeSet<>();
        set.add("red");
        set.add("green");
        set.add("blue");
        return set;
    }

    private static Set<Integer> create(int nrOfElements) {
        Set<Integer> set = new TreeSet<>();
        for (int element = 0; element < nrOfElements; element++) {
            set.add(element);
        }
        return set;
    }

    /**
     * 2. Write a Java program to iterate through all elements in a tree set.
     *
     * @param set
     */
    private static void print(Set set) {
        set.forEach(System.out::println);
    }

    /**
     * 3. Write a Java program to add all the elements of a specified tree set to another tree set.
     *
     * @param set
     * @return
     */
    private static Set<String> addToAnother(Set<String> set) {
        return new TreeSet<>(set);
    }

    /**
     * 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
     *
     * @param set
     * @return
     */
    private static Set<String> revers(TreeSet<String> set) {
        return set.descendingSet();
    }

    /**
     * 5. Write a Java program to get the first and last elements in a tree set.
     *
     * @param set
     */
    private static void getFirstAndLast(TreeSet<String> set) {
        System.out.println(String.format("First element is: %s", set.first()));
        System.out.println(String.format("Last element is: %s", set.last()));
    }

    /**
     * 6. Write a Java program to clone a tree set list to another tree set.
     *
     * @param set
     * @return
     */
    private static Set<String> clone(Set<String> set) {
        return new TreeSet<>(set);
    }

    /**
     * 7. Write a Java program to get the number of elements in a tree set.
     *
     * @param set
     * @return
     */
    private static int getNumberOfElements(Set<String> set) {
        return set.size();
    }

    /**
     * 8. Write a Java program to compare two tree sets.
     *
     * @param first
     * @param second
     * @return
     */
    private static boolean compare(Set<String> first, Set<String> second) {
        boolean isEqual = false;
        first.retainAll(second);
        if (!second.isEmpty() && first.size() == second.size()) isEqual = true;
        return isEqual;
    }

    /**
     * 9. Write a Java program to find the numbers less than 7 in a tree set.
     *
     * @param set
     * @param element
     * @return
     */
    private static Set<Integer> findNumbersLessThan(TreeSet<Integer> set, int element) {
        set.headSet(element);
        return set;
    }

    /**
     * 10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
     *
     * @param set
     * @param element
     * @return
     */
    private static int findElementGreaterOrEqual(TreeSet<Integer> set, int element) {
        return set.ceiling(element);
    }

    /**
     * 11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
     *
     * @param set
     * @param element
     * @return
     */
    private static int findElementLessOrEqual(TreeSet<Integer> set, int element) {
        return set.floor(element);
    }

    /**
     * 12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
     *
     * @param set
     * @param element
     * @return
     */
    private static int findElementStrictlyGreater(TreeSet<Integer> set, int element) {
        return set.higher(element);
    }

    /**
     * 13. Write a Java program to get an element in a tree set which is strictly less than the given element.
     *
     * @param set
     * @param element
     * @return
     */
    private static int findElementStrictlyLess(TreeSet<Integer> set, int element) {
        return set.lower(element);
    }

    /**
     * 14. Write a Java program to retrieve and remove the first element of a tree set.
     *
     * @param set
     * @return
     */
    private static String retriveAndRemoveFirst(TreeSet<String> set) {
        return set.pollFirst();
    }

    /**
     * 15. Write a Java program to retrieve and remove the last element of a tree set.
     *
     * @param set
     * @return
     */
    private static String retriveAndRemoveLast(TreeSet<String> set) {
        return set.pollLast();
    }

    /**
     * 16. Write a Java program to remove a given element from a tree set.
     *
     * @param set
     * @param element
     * @return
     */
    private static Set<String> remove(Set<String> set, String element) {
        set.remove(element);
        return set;
    }

}
