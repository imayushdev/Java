package CollectionsFramework.Essentials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class CollectionSortMethods {
    public static void main(String[] args) {


        List<Integer> number = List.of(11, 2, 353, 24, 5, 56); //creates immutable list
        List<Integer> numberAl = new ArrayList<>(number);
        List<String> Names = List.of("Ayush","Isha","Shikha","Sakshi","Aryan");
        List<String> NamesAl = new ArrayList<>(Names);
        Collections.sort(numberAl);
        Collections.sort(NamesAl);
        System.out.println(NamesAl);
       //numberAl.sort();          //from List Interface and ask for comparator as input;
        Collections.sort(numberAl);  //from collections class; asks for list as parameter
        System.out.println(numberAl);
        //comparator is like rule to tell how to compare ;
        //Till here no need to pass comparator because java already knows how to compare Integer
        //or String class because its implements comparable i/f;
        //comparable is directly use natural order of sorting
        //but if we want specified comparison we have to use
        //comparator i/f and tell rules
    }
}