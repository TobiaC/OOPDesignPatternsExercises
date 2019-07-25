package AbstractFactory;

import java.util.Objects;

public class FactoryProvider{
    public Factory chooseFactory(String factory){
        Objects.requireNonNull(factory);
        if(factory.equalsIgnoreCase("veichle")){
            return new VehicleFactory();
        } else if(factory.equalsIgnoreCase("color")){
            return new ColorFactory();
        } else {
            throw new RuntimeException("not existing factory");
        }
    }

}
