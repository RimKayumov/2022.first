package Patterns._2_AbstractFactory.SausageShop;

import Patterns._2_AbstractFactory.Human;

public class Butcher implements Human {
    @Override
    public void work() {
        System.out.println("I killed this PIG! Blood!");
    }
}
