package Patterns._2_AbstractFactory.HappyFamily;

import Patterns._2_AbstractFactory.Animal;

public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("Myyaauuu! I'm Happy Cat! Mrrrr...");
    }
    protected static String name = "Barsik";
}
