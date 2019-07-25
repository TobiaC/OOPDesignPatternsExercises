package Factory;

public class VeichleFactory {
    public Veichle createVeichle(int numberOfWheels) {
        if(numberOfWheels == 2){
            return new Motorcycle();
        } else if (numberOfWheels==3){
            return new Tricycle();
        } else if (numberOfWheels==4){
            return new Car();
        } else {
            throw new RuntimeException("veichle not existing");
        }
    }
}//class
