package HouseFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kindOfHouse = scan.next();
        scan.close();

        HouseFactory houseFactory = createHouseByKind(kindOfHouse);
        House house = houseFactory.buildAHouse();
        house.build();


    }
    static HouseFactory createHouseByKind(String kindOfHouse){
        if (kindOfHouse.equalsIgnoreCase("коттедж")) return new CottageFactory();
        else if (kindOfHouse.equalsIgnoreCase("квартира")) return new FlatFactory();
        else if (kindOfHouse.equalsIgnoreCase("бунгало")) return new BungalowFactory();
        else throw new RuntimeException(kindOfHouse + " is unknown kind of house.");
    }
}
