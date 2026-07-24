package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeueInterfaceDemo {
    public static void main(String[] args) {
        Deque<Integer> q2 = new ArrayDeque<>();
        //  ArrayDeque<>(); is a class specially designed for stack and queue implementation
        //  uses the circular array
        // allows both LIFO and FIFO operations

        //1 use as queue
        // Can take Queue interface
        //if Choose deque and perform operations accordingly

        q2.add(123);   //adds at last like at rightmost position   comes first
        q2.add(456);
        q2.add(789);
        q2.offer(223); //adds at rightmost but doesn't throw exception when queue is full;
        q2.offer(486);
        System.out.print(q2);
        System.out.println();
        System.out.println(q2.remove());   //removed 123 which came first so follows LIFO    //out first
        System.out.println(q2.poll());  //will remove 456 and no exception if list is empty
        System.out.println(q2);


//2. use as stack             //insertion deletion at same end forces LIFO
        q2.addFirst(123);
        q2.addFirst(456);
        q2.addFirst(789);
        q2.addFirst(223);
        q2.addFirst(486);      //comes at last
        System.out.print(q2);
        System.out.println();
        System.out.println(q2.removeFirst());    //goes out first
        System.out.println(q2.removeFirst());




    }
}
