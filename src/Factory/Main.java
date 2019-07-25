package Factory;

public class Main {
    public static void main(String[] args) {
        VeichleFactory veichleFactory = new VeichleFactory();
        Veichle veichle = veichleFactory.createVeichle(3);
        System.out.println(veichle.getType());
    }
}
