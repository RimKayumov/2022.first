package AnimalFactory;

import AnimalFactory.Animal;

public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("Мяяяяу!!! Я кошка.");
    }
}
