package HouseFactory;

public class BungalowFactory implements HouseFactory {
    @Override
    public House buildAHouse() {
        return new Bungalow();
    }
}
