package CollectionsFramework.IterableInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
            List<Integer> list=  new ArrayList<>();
            list.add(1);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
        System.out.println(list); // use of List i/f
//        for(Integer i : list){
//            System.out.print(" "+ i +" ");   //use of for each internal iterator();
//        }
         Iterator<Integer> itr =  list.iterator(); //using direct iterator method
//        while(itr.hasNext()){
//            System.out.print(itr);
//        }
        ListIterator<Integer> litr =  list.listIterator();
        while(litr.hasNext()){
            if(litr.next()==5){
                //litr.remove();
                litr.set(100);
            }
            System.out.print(list);

        }









    }


    }

