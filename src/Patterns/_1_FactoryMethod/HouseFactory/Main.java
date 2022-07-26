package Patterns._1_FactoryMethod.HouseFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please, choose a house type -> ");
        Scanner scan = new Scanner(System.in);
        String kindOfHouse = scan.next();
        scan.close();

        HouseFactory houseFactory = createHouseByKind(kindOfHouse);
        House house = houseFactory.buildAHouse();
        house.build();
    }
    static HouseFactory createHouseByKind(String kindOfHouse){
        if (kindOfHouse.equalsIgnoreCase("cottage")) return new CottageFactory();
        else if (kindOfHouse.equalsIgnoreCase("flat")) return new FlatFactory();
        else if (kindOfHouse.equalsIgnoreCase("bungalow")) return new BungalowFactory();
        else throw new RuntimeException(kindOfHouse + " is unknown kind of house.");
    }
}
