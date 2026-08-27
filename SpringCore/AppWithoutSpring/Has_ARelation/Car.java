package SpringCore.AppWithoutSpring.Has_ARelation;

public class Car {
    private Engine engine = new Engine();        //car has an Engine
    public void StartCar(){
        engine.StartEngine();
        System.out.println("Car Started ");
    }



}
