package Patterns._2_AbstractFactory;

import Patterns._2_AbstractFactory.HappyFamily.HappyFamilyFactory;

public class MrJohnFamily {
    public static void main(String[] args) {
        ActionFactory actionFactory = new HappyFamilyFactory();
        Human human = actionFactory.getHuman();
        Item item = actionFactory.getItem();
        Animal animal = actionFactory.getAnimal();

        human.work();
        item.act();
        animal.say();
    }
}
