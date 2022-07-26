package HouseFactory;

public class Cottage implements House{
    @Override
    public void build() {
        for (int i = 0; i < 39; i++) {
            System.out.print("/");
        }
    }
}
