package Patterns._2_AbstractFactory;

import Patterns._2_AbstractFactory.SausageShop.SausageShopFactory;

public class MCDonalds {
    public static void main(String[] args) {
        ActionFactory actionFactory = new SausageShopFactory();
        Human human = actionFactory.getHuman();
        Item item = actionFactory.getItem();
        Animal animal = actionFactory.getAnimal();

        human.work();
        item.act();
        animal.say();
    }
}
