package CollectionsFramework.MapInterface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//no order preserve
//only one null key values may be multiple
//not synchronized but hashtable is and that's only diff in both
public class HashMapDemo {
    public static void main(String[] args) {
        /*
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        System.out.println(map);
        System.out.println( map.containsKey("A"));
        System.out.println(map.containsValue(1));
        System.out.println(map.get("D"));
        System.out.println(map.containsKey("A"));

         */
        //some important operations
        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("A", 13253);
        map2.put("B", 22542);
        map2.put("C", 3162);
        map2.put("D", 4213);
        map2.put("E", 524);
        System.out.println(map2.keySet());//set of  Keys
        Set<String> set2 = new TreeSet<>();

        set2 =map2.keySet();
        System.out.println(set2);
        //set2.add("G");           //unsupported operation as can't add key only
        set2.remove("A");
        System.out.println("After Removal of key  " +set2);           //key removed
        System.out.println(map2.values());     //set of Values but 13253 removed as its key removed
        Set<Map.Entry<String,Integer>> set= map2.entrySet();  //most used
        //  gives key value pair view
        System.out.println(set);



    }
}
