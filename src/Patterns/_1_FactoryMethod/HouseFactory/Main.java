package Patterns._1_FactoryMethod.HouseFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HouseFactory houseFactory = createHouseByKind(KindOfHouse.FLAT);
        //HouseFactory houseFactory = createHouseByKind(KindOfHouse.BUNGALOW);
        //HouseFactory houseFactory = createHouseByKind(KindOfHouse.COTTAGE);
        House house = houseFactory.buildAHouse();
        house.build();
    }

    static HouseFactory createHouseByKind(KindOfHouse kindOfHouse) {
        switch(kindOfHouse){
            case FLAT: return new FlatFactory();
            case COTTAGE: return new CottageFactory();
            case BUNGALOW: return new BungalowFactory();
            default: throw new RuntimeException(kindOfHouse + " is unknown kind of house.");
        }
    }
}
