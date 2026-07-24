package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
// ll implementation of queue allowed because of doubly linked list
// Queue interface forces FIFO principle
public class queueInterfaceDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(123);   //adds at last like at rightmost position
        q.add(456);
        q.add(789);
        q.offer(223); //adds at rightmost but doesn't throw exception when queue is full;
        q.offer(486);
        System.out.print(q);
        System.out.println();
        //  Collections.sort (q); ye nahi karna vrnaa vo queue kis naam kaa like maintain fifo
        System.out.println(q.remove());   //removed 123 which came first
        System.out.println(q.poll());  //will remove 456 and no exception if list is empty
        System.out.println(q);

        // Queue<Integer> q2 = new ArrayList<Integer>();  Not possible as it not allows operations at both ends
        Deque<Integer> q2 = new ArrayDeque<>();
        //  ArrayDeque<>(); specially designed for stack and queue implementation
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


