package collection;


import java.util.*;

public class TreeMapPractice {
    public static void main(String[] args) {
        Map<String, String> map = create();

        Map<String, String> copied = copy(map);

        String firstKey = "color";
        System.out.println(String.format("Map has key=%s %s", firstKey, containsKey(map, firstKey)));

        String value = "white";
        System.out.println(String.format("Map has value=%s %s", value, containsValue(map, value)));

        System.out.println(String.format("Map has following keys: %s", getKeys(map).toString()));

        System.out.println(String.format("Sorted map: %s ", sort(map)));

        printFirstAndLastEntry((TreeMap<String, String>) map);

        printFirstAndLastKey((TreeMap<String, String>) map);

        printKeysReversed((TreeMap<String, String>) map);

        if (deleteAll(map).isEmpty()) System.out.println("Deleted all entries! ");

        Map<Integer, String> random = create(22);
        int secondKey = 5;
        printGratesOrEqualElement((TreeMap<Integer, String>) random, secondKey);

        printGratesOrEqualKey((TreeMap<Integer, String>) random, secondKey);

        printSubMapStrictlyLess((TreeMap<Integer, String>) random, secondKey);

        printSubMapLess((TreeMap<Integer, String>) random, secondKey);

        printStrictlyGreaterKey((TreeMap<Integer, String>) random, secondKey);

        printElementsStrictlyLess((TreeMap<Integer, String>) random, secondKey);

        printStrictlyLessKey((TreeMap<Integer, String>) random, secondKey);

        NavigableSet<Integer> navigableKeySet = getNavigableKeySet((TreeMap<Integer, String>) random);
        System.out.println(String.format("Navigable key set is : %s", navigableKeySet));

        System.out.println(String.format("First element %s", retainFirst((TreeMap<Integer, String>) random).toString()));

        System.out.println(String.format("Last element %s", retainLast((TreeMap<Integer, String>) random).toString()));

        int from = 2, to = 9;
        System.out.println(String.format("SubMap from inclusive to exclusive: %s",
                subMapFromInclusiveToExclusive((TreeMap<Integer, String>) random, from, to)));

        System.out.println(String.format("SubMap from inclusive to inclusive: %s",
                subMapFromInclusiveToInclusive((TreeMap<Integer, String>) random, from, to)));

        System.out.println(String.format("Map whose keys are greater than or equal to a given key: %s are %s",
                secondKey,
                subMapGreaterOrEqualKey((TreeMap<Integer, String>) random, secondKey)));

        System.out.println(String.format("Map whose keys are greater than to a given key: %s are %s",
                secondKey,
                subMapGreaterKey((TreeMap<Integer, String>) random, secondKey)));

        System.out.println(String.format("Get a key-value mapping associated with the least key greater than or equal to the given key %s",
                getElementWithLeastKey((TreeMap<Integer, String>) random, secondKey)));

        System.out.println(String.format("Get the least key greater than or equal to the given key: %s",
                getKeyWithLeastKey((TreeMap<Integer, String>) random, secondKey)));

    }

    /**
     * 1. Write a Java program to associate the specified value with the specified key in a Tree Map.
     *
     * @return
     */
    private static Map<String, String> create() {
        Map<String, String> map = new TreeMap<>();
        map.put("color", "green");
        map.put("shape", "circle");
        map.put("digit", "one");
        return map;
    }

    private static Map<Integer, String> create(int nrOfElements) {
        Map<Integer, String> map = new TreeMap<>();
        for (int element = 0; element < nrOfElements; element++) {
            map.put(element, String.valueOf(element));
        }
        return map;
    }

    /**
     * 2. Write a Java program to copy a Tree Map content to another Tree Map.
     *
     * @param map
     * @return
     */
    private static Map<String, String> copy(Map<String, String> map) {
        return new TreeMap<>(map);
    }


    /**
     * 3. Write a Java program to search a key in a Tree Map.
     *
     * @param map
     * @param key
     * @return
     */
    private static boolean containsKey(Map<String, String> map, String key) {
        return map.containsKey(key);
    }

    /**
     * 4. Write a Java program to search a value in a Tree Map.
     *
     * @param map
     * @param value
     * @return
     */
    private static boolean containsValue(Map<String, String> map, String value) {
        return map.containsValue(value);
    }

    /**
     * 5. Write a Java program to get all keys from the given a Tree Map.
     *
     * @param map
     * @return
     */
    private static Set<String> getKeys(Map<String, String> map) {
        return map.keySet();
    }

    /**
     * 6. Write a Java program to delete all elements from a given Tree Map.
     *
     * @param map
     * @return
     */
    private static Map<String, String> deleteAll(Map<String, String> map) {
        map.clear();
        return map;
    }

    /**
     * 7. Write a Java program to sort keys in Tree Map by using comparator.
     *
     * @param map
     * @return
     */
    private static Map<String, String> sort(Map<String, String> map) {
        Map<String, String> newMap = new TreeMap<String, String>(new keyComparator());
        newMap.putAll(map);
        return newMap;
    }

    /**
     * 8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
     *
     * @param map
     */
    private static void printFirstAndLastEntry(TreeMap<String, String> map) {
        System.out.println("Greatest Entry: " + map.firstEntry());
        System.out.println("Least Entry: " + map.lastEntry());
    }

    /**
     * 9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
     *
     * @param map
     */
    private static void printFirstAndLastKey(TreeMap<String, String> map) {
        System.out.println("Greatest key: " + map.firstKey());
        System.out.println("Least key: " + map.lastKey());
    }

    /**
     * 10. Write a Java program to get a reverse order view of the keys contained in a given map.
     *
     * @param map
     */
    private static void printKeysReversed(TreeMap<String, String> map) {
        System.out.println("Reverse order view of the keys: " + map.descendingKeySet());
    }

    /**
     * 11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
     *
     * @param map
     * @param key
     */
    private static void printGratesOrEqualElement(TreeMap<Integer, String> map, int key) {
        System.out.println(String.format("get a key-value mapping associated with the greatest key less than or equal to the given key=%d is %s" , key, map.floorEntry(key)));
    }

    /**
     * 12. Write a Java program to get the greatest key less than or equal to the given key.
     *
     * @param map
     * @param key
     */
    private static void printGratesOrEqualKey(TreeMap<Integer, String> map, int key) {
        System.out.println(String.format("Greatest key less than or equal to the given key=%d is %d", key, map.floorKey(key)));
    }


    /**
     * 13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
     *
     * @param map
     * @param key
     */
    private static void printSubMapStrictlyLess(TreeMap<Integer, String> map, int key) {
        System.out.println(String.format("Portion of a map whose keys are strictly less than a given key=%d %s", key, map.headMap(key).toString()));
    }

    /**
     * 14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is
     * true) a given key.
     *
     * @param map
     * @param key
     */
    private static void printSubMapLess(TreeMap<Integer, String> map, int key) {
        System.out.println(String.format("Portion of a map whose keys are less than a given key=%d is %s", key, map.headMap(key, true).toString()));
    }


    /**
     * 15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
     *
     * @param map
     * @param key
     */
    private static void printStrictlyGreaterKey(TreeMap<Integer, String> map, int key) {
        System.out.println(String.format("Get the least key strictly greater than a given key=%d is %s", key, map.higherKey(key).toString()));
    }

    /**
     * 16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
     *
     * @param map
     * @param key
     */
    private static void printElementsStrictlyLess(TreeMap<Integer, String> map, int key) {
        System.out.println(String.format("Get a key-value mapping associated with the greatest key strictly less than a given key=%d is %s", key, map.lowerEntry(key).toString()));
    }

    /**
     * 17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
     *
     * @param map
     * @param key
     */
    private static void printStrictlyLessKey(TreeMap<Integer, String> map, int key) {
        System.out.println(String.format("Get the least key strictly less than a given key=%d is %s", key, map.lowerKey(key).toString()));
    }

    /**
     * 18. Write a Java program to get NavigableSet view of the keys contained in a map.
     *
     * @param map
     * @return
     */
    private static NavigableSet<Integer> getNavigableKeySet(TreeMap<Integer, String> map) {
        return map.navigableKeySet();
    }

    /**
     * 19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.
     *
     * @param map
     * @return
     */
    private static Map.Entry<Integer, String> retainFirst(TreeMap<Integer, String> map) {
        return map.pollFirstEntry();
    }

    /**
     * 20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
     *
     * @param map
     * @return
     */
    private static Map.Entry<Integer, String> retainLast(TreeMap<Integer, String> map) {
        return map.pollLastEntry();
    }

    /**
     * 21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
     *
     * @param map
     * @param from
     * @param to
     * @return
     */
    private static Map<Integer, String> subMapFromInclusiveToExclusive(TreeMap<Integer, String> map, int from, int to) {
        return map.subMap(from, to);
    }

    /**
     * 22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
     *
     * @param map
     * @param from
     * @param to
     * @return
     */
    private static Map<Integer, String> subMapFromInclusiveToInclusive(TreeMap<Integer, String> map, int from, int to) {
        return map.subMap(from, true, to, true);
    }

    /**
     * 23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
     *
     * @param map
     * @param key
     * @return
     */
    private static Map<Integer, String> subMapGreaterOrEqualKey(TreeMap<Integer, String> map, int key) {
        return map.tailMap(key);
    }

    /**
     * 24. Write a Java program to get a portion of a map whose keys are greater than to a given key.
     *
     * @param map
     * @param key
     * @return
     */
    private static Map<Integer, String> subMapGreaterKey(TreeMap<Integer, String> map, int key) {
        return map.tailMap(key, true);
    }


    /**
     * 25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the
     * given key. Return null if there is no such key.
     *
     * @param map
     * @param key
     * @return
     */
    private static Map.Entry<Integer, String> getElementWithLeastKey(TreeMap<Integer, String> map, int key) {
        return map.ceilingEntry(key);
    }

    /**
     * 26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
     *
     * @param map
     * @param key
     * @return
     */
    private static Integer getKeyWithLeastKey(TreeMap<Integer, String> map, int key) {
        return map.ceilingKey(key);
    }
}

class keyComparator implements Comparator<String> {

//    @Override
//    public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
//        return (o1.getKey().equals(o2.getKey())) ? 1 : 0;
//    }

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}