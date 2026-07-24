package CollectionsFramework.Essentials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Custom objects demo
//use of comparable
public class Student implements Comparable<Student> {
 //solution 1
    @Override
    public int compareTo(Student that) { //return -1,0 or 1
       // return this.rollNum-that.rollNum ; //based on roll num
                                          //can use but not safe
        return Integer.compare(this.rollNum,that.rollNum); //better to use if int sort from Integer compare() method and same for others
        //return Integer.compare(that.rollNum,this.rollNum);// high to low <descending  order>
       // return Double.compare(this.Marks,that.Marks); based onn marks

    }

    @Override
    public String toString() {
        return rollNum+" "+name+" "+ Marks;
    }

    String name;
    int rollNum;
    double Marks;
    public Student(String name, int rollNum, int Marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.Marks = Marks;
    }

    public static void main(String[] args) {
        List<Student> students = List.of((new Student("Ayush",34,30))
               , new Student("Aryan",19 ,200)
        ,new Student("Sakshi",124,300));
        List <Student> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);
        Collections.sort(studentsAl); //cant directly call if not implement comparable
        //solution 1 class must implement comparable
        //           must override compare to method and tell how to compare
        //solution 2 pass list ,custom comparator
        Collections.sort(studentsAl, Collections.reverseOrder());
        System.out.println(studentsAl);
    }
}
