package AbstractFactory;

public class ColorFactory implements Factory {
    @Override
    public Color createColor(String color) {
        if(color.equalsIgnoreCase("red")){
            return new Red();
        } else if(color.equalsIgnoreCase("blue")){
            return new Blue();
        } else if (color.equalsIgnoreCase("yellow")){
            return new Yellow();
        } else {
            throw new RuntimeException("not existing color");
        }
    }

    @Override
    public Vehicle createVehicle(int numberOfWheels) {
        throw new UnsupportedOperationException();
    }
}
