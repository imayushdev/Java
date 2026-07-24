package CollectionsFramework.Essentials;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorStudent {
    String name;
    int rollNum;
    double Marks;

    public ComparatorStudent(String name, int rollNum, int Marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.Marks = Marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNum + ", Marks: " + Marks;
    }

    public static void main(String[] args) {
        List<ComparatorStudent> students = List.of((new ComparatorStudent("Ayush", 34, 30))
                , new ComparatorStudent("Aryan", 19, 200)
                , new ComparatorStudent("Sakshi", 124, 300));
        List<ComparatorStudent> studentsAl = new ArrayList<>(students);
        System.out.println("Normal"+studentsAl);
        //Collections.sort(studentsAl, Collections.reverseOrder()); //passed list,comparator
        //reverse order is already defined and sort in descending order
        //comparator is functional i/f but comparable not
        //because
        //System.out.println(studentsAl);
        //...............................................
        //compare custom objects using comparator
        //1.->creating custom comparator
        Comparator <ComparatorStudent> byRollNum = (s1,s2)->Integer.compare(s1.rollNum,s2.rollNum);
        studentsAl.sort(byRollNum);
        System.out.println("Based on roll num"+studentsAl);
        Comparator<ComparatorStudent> byName = (s1,s2)->s1.name.compareTo(s2.name);
        studentsAl.sort(byName);
        System.out.println("Based on Name "+studentsAl);

        //way 2
       // Comparator <ComparatorStudent> byRollNum = Comparator.comparingInt(s -> s.rollNum);
        //2-> calling sort() on list and passing comparator
        studentsAl.sort(byRollNum);

    }
}
