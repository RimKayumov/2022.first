package HouseFactory;

public class Bungalow implements House{
    @Override
    public void build() {
        for (int i = 0; i < 20; i++) {
            System.out.print(".");
        }
    }
}
