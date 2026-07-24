package CollectionsFramework.SetInterface;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;


public class treeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(112);                            //sorted
        set.add(22);                             //uses red black tree->self balanced binary search tree
        set.add(313);                            //cant store null
        set.add(44);                            //ensure 0 (log n) for any operation
        set.add(554);                        //not uses hashing
        //set.add(null);
       // System.out.println(set);


        NavigableSet<Integer> set2 = new TreeSet<>();
        set2.add(112);
        set2.add(22);
        set2.add(313);
        set2.add(44);
        set2.add(554);
        System.out.println(set2);   //increasing order
       // System.out.println(set2.descendingSet());    //decreasing order
        System.out.println(set2.first());
        System.out.println(set2.last());
        //navigable special methods
        System.out.println(set2.ceiling(300));  //least element greater or equals to given element
        System.out.println(set2.floor(300));  //greatest element less then given num
        System.out.println(set2.headSet(313,true));  //view of set less than element
        //no creation of new set so if changes done then will reflect in both original and subset
        //if true element self included else not
        System.out.println(set2.tailSet(313,true)); //element to till last
        System.out.println(set2.subSet(22,true,313,true));
        System.out.println(set2.higher(313));
        System.out.println(set2.lower(313));

        //same three methods for sorted set but terminal elements in subset headset are exclusive



    }
}

    //on custom objects and using comparable interface for sort
    class Book {      //implements Comparable<Book> {
        int id;
        String name;
        public Book( int id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Book Name: " + this.name + ", id: " + this.id;
        }

      /*  @Override
        public int compareTo (Book that){
            // return Integer.compare(this.id, that.id);
            return this.name.compareTo(that.name);

        }
        */

        public static void main(String[] args) {
            Comparator <Book> byName  = (e1,e2)->e1.name.compareTo(e2.name);
            Set<Book> set = new TreeSet<>(byName);
            Book b1 = new Book(1,"Ramayana");
            Book b2 = new Book(2,"Quran");
            Book b3 = new Book(3,"Bible");
            set.add(b1);
            set.add(b2);
            set.add(b3);
            System.out.println(set);

           /*System.out.println("Original "+set);
          Comparator <Book> byName  = (e1,e2)->e1.name.compareTo(e2.name);
            Set<Book> set1 = new TreeSet<>(byName);
            System.out.println("By Name :"+set);

            */
            Comparator<Book> byId = (e1,e2)->Integer.compare(e1.id, e2.id);


            Set<Book> set2 = new TreeSet<>(byId);
            set2.add(b1);
            set2.add(b2);
            set2.add(b3);
            System.out.println("By Id :"+set2);





        }
    }


