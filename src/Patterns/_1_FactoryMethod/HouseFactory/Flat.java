package Patterns._1_FactoryMethod.HouseFactory;

public class Flat implements House{
    @Override
    public void build() {
        int x = 0;
        while (x!=10) {
            for (int i = 0; i < 5; i++) {
                System.out.print("F");
            }
            int x2 = 0;
            while (x2 != 30) {
                System.out.print(" ");
                x2++;
            }
            for (int i = 0; i < 5; i++) {
                System.out.print("F");
            }
            System.out.println();
            x++;
        }
    }
}
