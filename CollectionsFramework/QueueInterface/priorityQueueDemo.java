package CollectionsFramework.QueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;



//uses min heap behind the scene that based on binary tree like parent min then child
public class priorityQueueDemo {
    public static void main(String[] args) {
        //Queue<Integer> q1 = new PriorityQueue<>();
        Queue<Integer> q1 = new PriorityQueue<>(Comparator.reverseOrder());  //passed comparator now max heap
        q1.add(4560);    //added first but is at 2nd place as parent should be min then children in min heap
        q1.add(123);
        q1.add(456);
        q1.add(0);
        q1.add(4);
        System.out.println(q1);
        System.out.println(q1.remove());    //removes 0 ie parent
        System.out.println(q1);
        System.out.println(q1.remove());    //removes 4 that is new parent
        //Comparator<priorityQueueDemo> cmp = (e1,e2)->(e) //not able to do because dont know on what basis

    }
}

     //priority queue on Custom Objects
class Employee {
    int id;
    String name;

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Comparator<Employee> c = (e1, e2) -> e1.name.compareTo(e2.name);  //created custom comparator



        Queue<Employee> q = new PriorityQueue<>(c);   //passed it.
        q.add(new Employee(1, "Aryan"));
        q.add(new Employee(2, "Ayush"));
        q.add(new Employee(234, "Sakshi"));
        q.add(new Employee(253, "Isha"));

        System.out.println(q);



    }
}