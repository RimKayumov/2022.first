package Patterns._1_FactoryMethod.HouseFactory;

public class Cottage implements House{
    @Override
    public void build() {
        int x = 0;
        while (x!=10) {
            for (int i = 0; i < 39; i++) {
                System.out.print("/");
            }
            System.out.println();
            x++;
        }
    }
}
