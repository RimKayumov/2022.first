package Patterns._1_FactoryMethod.HouseFactory;

public class FlatFactory implements HouseFactory {
    @Override
    public House buildAHouse() {
        return new Flat();
    }
}
