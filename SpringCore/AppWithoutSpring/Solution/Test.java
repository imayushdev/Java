package SpringCore.AppWithoutSpring.Solution;

public class Test {
    public static void main(String[] args) {
       Car car = new Car(new DieselEngine());
        car.Drive();
    }
}
//need constructor to creation and injection on car class
//this si dependency injection that car is not creating engine just injected directly
//this whole injection and creation done by spring framework that is its need
