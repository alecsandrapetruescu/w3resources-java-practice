package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, String> map = create();

        System.out.println(String.format("Number of elements is : %d", numberOfElements(map)));

        Map<String, String> copied = copy(map);

//        removeAll(map);
        if (map.isEmpty()) System.out.println("Removed all elements of the map");

        System.out.println(String.format("Map is empty: %s", isEmpty(map)));

        System.out.println(String.format("Copied map is %s", shallowCopy(map)));

        String key = "color";
        System.out.println(String.format("Map contains key=%s is %s", key, containsKey(map, key)));

        String value = "color";
        System.out.println(String.format("Map contains value=%s is %s", value, containsValue(map, value)));

        System.out.println(String.format("Map entries: %s", getEntries(map).toString()));

        System.out.println(String.format("Map value of key=%s is %s", key , getValue(map, key)));

        System.out.println(String.format("Map keys are %s", getKeys(map)));

        System.out.println(String.format("Map values are %s", getValues(map)));
    }

    /**
     * 1. Write a Java program to associate the specified value with the specified key in a HashMap.
     *
     * @return a map
     */
    private static Map<String, String> create() {
        Map<String, String> map = new HashMap<>();
        map.put("color", "green");
        map.put("shape", "circle");
        map.put("digit", "one");
        return map;
    }

    /**
     * 2. Write a Java program to count the number of key-value (size) mappings in a map.
     *
     * @param map
     * @return
     */
    private static int numberOfElements(Map<String, String> map) {
        return map.size();
    }

    /**
     * 3. Write a Java program to copy all of the mappings from the specified map to another map.
     *
     * @param map
     * @return
     */
    private static Map<String, String> copy(Map<String, String> map) {
        return new HashMap<>(map);
    }

    /**
     * 4. Write a Java program to remove all of the mappings from a map.
     *
     * @param map
     */
    private static void removeAll(Map<String, String> map) {
        map.clear();
    }

    /**
     * 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
     *
     * @param map
     * @return
     */
    private static boolean isEmpty(Map<String, String> map) {
        return map.isEmpty();
    }

    /**
     * Write a Java program to get a shallow copy of a HashMap instance.
     * @param map
     * @return
     */
    private static Map<String, String> shallowCopy(Map<String, String> map) {
        return new HashMap<>(map);
    }

    /**
     * 7. Write a Java program to test if a map contains a mapping for the specified key.
     * @param map
     * @param key
     * @return
     */
    private static boolean containsKey(Map<String, String> map, String key) {
        return map.containsKey(key);
    }

    /**
     * 8. Write a Java program to test if a map contains a mapping for the specified value.
     *
     * @param map
     * @param value
     * @return
     */
    private static boolean containsValue(Map<String, String> map, String value) {
        return map.containsValue(value);
    }

    /**
     * 9. Write a Java program to create a set view of the mappings contained in a map.
     *
     * @param map
     * @return
     */
    private static Set<Map.Entry<String, String>> getEntries(Map<String, String> map) {
        return map.entrySet();
    }

    /**
     * 10. Write a Java program to get the value of a specified key in a map.
     *
     * @param map
     * @param key
     * @return
     */
    private static String getValue(Map<String, String> map, String key) {
        return map.get(key);
    }

    /**
     * 11. Write a Java program to get a set view of the keys contained in this map.
     *
     * @param map
     * @return
     */
    private static Set<String> getKeys(Map<String, String> map) {
        return map.keySet();
    }

    /**
     * 12. Write a Java program to get a collection view of the values contained in this map.
     *
     * @param map
     * @return
     */
    private static Collection<String> getValues(Map<String, String> map) {
        return map.values();
    }
}
