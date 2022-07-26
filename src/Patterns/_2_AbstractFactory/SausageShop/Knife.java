package Patterns._2_AbstractFactory.SausageShop;

import Patterns._2_AbstractFactory.Item;

public class Knife implements Item {
    @Override
    public void act() {
        System.out.println("FFFFFooooookHHHHH!!! Kill!");
    }
}
