package AbstractFactory;

public interface Factory {
    Vehicle createVehicle(int numberOfWheels);
    Color createColor(String color);
}
