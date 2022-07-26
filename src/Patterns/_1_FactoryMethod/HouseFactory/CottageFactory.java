package Patterns._1_FactoryMethod.HouseFactory;

public class CottageFactory implements HouseFactory {
    @Override
    public House buildAHouse() {
        return new Cottage();
    }
}
