package SpringCore.AppWithoutSpring.Solution;

public class Car {
    private Engine engine;       //removed dependencies via interface
    //car depends on engine only
    //weather engine has different variants
    public Car(Engine engine){      //injecting engine obj in car
        this.engine = engine;
    }
    public void Drive(){
        engine.Start();
        System.out.println("Driving Car");
    }
}
