package HouseFactory;

public class FlatFactory implements HouseFactory {
    @Override
    public House buildAHouse() {
        return new Flat();
    }
}
