package HouseFactory;

public class CottageFactory implements HouseFactory {
    @Override
    public House buildAHouse() {
        return new Cottage();
    }
}
