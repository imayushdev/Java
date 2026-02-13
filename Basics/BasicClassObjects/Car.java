package Baisic_Class_Objects;

public class Car{
    int Model;
    int year;
    String Color;
    void acc(){
        System.out.print("Accelirating and increasing speed");

    }
    void stop(){
        System.out.print("Applying breaks and reducing speed");
    }
    void display(){
        System.out.print("Model :"+Model+"\nYear: " +year+"\nColor :"+Color);
    }
}
class Carinfo{
    public static void main(String[] args){
        Car object = new Car();
        object.Model = 1989;
        object.year =20;
        object.Color="Red";
        object.display();

    }
}