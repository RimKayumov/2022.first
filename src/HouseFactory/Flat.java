package HouseFactory;

public class Flat implements House{
    @Override
    public void build() {
        for (int i = 0; i < 30; i++) {
            System.out.print("*");
        }
    }
}
