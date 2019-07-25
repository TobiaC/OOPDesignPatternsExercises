package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        FactoryProvider provider = new FactoryProvider();
        Factory vehicleFactory = provider.chooseFactory("veichle");
        Factory colorFactory = provider.chooseFactory("color");

        Vehicle vehicle = vehicleFactory.createVehicle(4);
        Color color = colorFactory.createColor("red");
        System.out.println(vehicle.getType());
        System.out.println(color.getColor());
    }
}
