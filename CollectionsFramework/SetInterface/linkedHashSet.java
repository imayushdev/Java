package CollectionsFramework.SetInterface;

import java.util.Arrays;
import java.util.LinkedHashSet;
//maintains order



public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(21);
        set.add(33);
        set.add(45);
        set.add(54);
        set.add(6);
        set.add(6);
        System.out.println(set.size());
        set.add(null);
        set.add(null);
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set);
        System.out.println(set);


    }
}
