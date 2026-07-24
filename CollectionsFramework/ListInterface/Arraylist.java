package CollectionsFramework.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {


    public static void main(String[] args) {
        List<Integer > list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        //List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list);
       // System.out.println(list2);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


       // list.add(3,5);
      //  System.out.println(list);
       // list.add(3);
       // System.out.println(list);
        //System.out.println(list.get(3));
        list.remove(Integer.valueOf(1));
       // System.out.println(list);

    }
}
/*
Object (ब्रह्मांड की सभी क्लासेस का बाप)
  └── Iterable (इंटरफेस - जिसके पास iterator() मेथड है)
        └── Collection (इंटरफेस - जो ग्रुप डेटा के नियम तय करता है)
              └── List / Set / Queue (विशिष्ट इंटरफेस)
                    └── ArrayList / HashSet (असली क्लासेस)
                          └── [इसके अंदर छिपी है वो 'Itr' क्लास जो Iterator इंटरफेस को इम्प्लीमेंट करती है]
*/