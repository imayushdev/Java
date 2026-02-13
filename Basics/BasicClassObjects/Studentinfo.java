package Baisic_Class_Objects;

public class Studentinfo{
    String Name;
    int Age;
    int Id;
    void display(){
        System.out.print("Name:"+Name+"\nAge :"+ Age+"\n id : " +Id+"\n");
    }
}
 class Student{
    public static void main(String [] args){
        Studentinfo object =  new Studentinfo();
        object.Name= "Rahul";
        object.Age = 34;
        object.Id= 211;
        object.display();
    }


 }