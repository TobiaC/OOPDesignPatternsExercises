package AbstractFactory;

public class Car implements Vehicle {
    @Override
    public String getType() {
        return "I'm a car";
    }
}
