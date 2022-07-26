package Patterns._2_AbstractFactory.HappyFamily;

import Patterns._2_AbstractFactory.Human;

public class Owner implements Human {
    @Override
    public void work() {
        System.out.println("I'm owner of " + Cat.name);
    }
}
