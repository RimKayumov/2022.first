package Patterns._2_AbstractFactory.HappyFamily;

import Patterns._2_AbstractFactory.ActionFactory;
import Patterns._2_AbstractFactory.Animal;
import Patterns._2_AbstractFactory.Human;
import Patterns._2_AbstractFactory.Item;

public class HappyFamilyFactory implements ActionFactory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }

    @Override
    public Human getHuman() {
        return new Owner();
    }

    @Override
    public Item getItem() {
        return new Toy();
    }
}
