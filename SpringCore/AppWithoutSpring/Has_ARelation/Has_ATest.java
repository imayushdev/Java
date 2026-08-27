package SpringCore.AppWithoutSpring.Has_ARelation;

public class Has_ATest {
    public static void main(String[] args) {
        Car car = new Car();
        car.StartCar();  //only required can use
    }
}
//new Problem
//Engine Object Creation:- Car Class
//car is responsible for using engine + creating engine
//car class become tightly coupled with engine class
// its not good design so solution is  program to interface
// design rule extension of class not modification
