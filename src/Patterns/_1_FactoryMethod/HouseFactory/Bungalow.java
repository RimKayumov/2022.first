package Patterns._1_FactoryMethod.HouseFactory;

public class Bungalow implements House{
    @Override
    public void build() {
        int x = 0;
        while (x!=4) {
            for (int i = 0; i < 25; i++) {
                System.out.print("/");
            }
            System.out.println();
            x++;
        }
    }
}
