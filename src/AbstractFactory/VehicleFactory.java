package AbstractFactory;

public class VehicleFactory implements Factory {
    @Override
    public Vehicle createVehicle(int numberOfWheels) {
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

    @Override
    public Color createColor(String color) {
        throw new UnsupportedOperationException();
    }
}
