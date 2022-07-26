package Patterns._2_AbstractFactory.SausageShop;

import Patterns._2_AbstractFactory.ActionFactory;
import Patterns._2_AbstractFactory.Animal;
import Patterns._2_AbstractFactory.Human;
import Patterns._2_AbstractFactory.Item;

public class SausageShopFactory implements ActionFactory {
    @Override
    public Animal getAnimal() {
        return new Pig();
    }

    @Override
    public Human getHuman() {
        return new Butcher();
    }

    @Override
    public Item getItem() {
        return new Knife();
    }
}
