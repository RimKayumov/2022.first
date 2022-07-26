package Patterns._2_AbstractFactory.HappyFamily;

import Patterns._2_AbstractFactory.Item;

public class Toy implements Item {
    @Override
    public void act() {
        System.out.println("This is a TOY and it plays");
    }
}
