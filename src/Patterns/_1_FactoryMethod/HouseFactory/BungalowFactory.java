package Patterns._1_FactoryMethod.HouseFactory;

public class BungalowFactory implements HouseFactory {
    @Override
    public House buildAHouse() {
        return new Bungalow();
    }
}
