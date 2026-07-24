package CollectionsFramework.SetInterface;

import java.util.*;

public class setInterfaceDemo {
    public static void main(String[] args) {
    //    implementing Set Interface using Hashset allows unique , unordered and only one null
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);    //for any info regarding internal working go to doubt repo->hashset InternalWorking
        set.add(2);
        System.out.println(set);
        List<Integer> list = List.of(1,1,1,2,3,4,3,4,5,6,7,3);
        List <Integer> list1=new ArrayList<>(list);
        System.out.println(list1);  //all print
        Set<Integer> set1 = new HashSet<>(list);
        System.out.println(set1);          //1,2,3,4,5,6,7 output only unique



    }
}
//let's try on custom objects
class Customer{
    int id;
    String name;
    Customer(int id,String name){
        this.id=id;
        this.name=name;
    }


    @Override
    public String toString() {
        return  "id "+ id +" name "+ name;
    }
    //must to overwrite both to avoid duplicates that is core principle of set

    @Override
    public boolean equals(Object obj) {
        if(this==obj)  return true;                          //checks both objects share  same mem address
        if(!(obj instanceof Customer that)){ return false;} // checks if object of  different type or class
        return this.name.equals(that.name) && this.id==that.id;  //checks if location different but if content same
    }
    @Override
    public int hashCode() {                  // Generates the hashcode
        return Objects.hash(id,name);        //same object -> hashcode must same
    }                                        // hashcode same not means same object like bucket same but element may be Different

    public static void main(String[] args) {
        HashSet<Customer> set=new HashSet<>();
            Customer c1=new Customer(1,"Ayush Sharma");
            Customer c2=new Customer(2,"Aryan Sharma");
            Customer c3=new Customer(3,"Sakshi Sharma");
            Customer c4=new Customer(1,"ayush Sharma");
        Customer c5=new Customer(1,"Ayush Sharma");      //added again as not overwritten equals() and hashcode() methods
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        System.out.println(set);

    }
}





