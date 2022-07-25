package AnimalFactory;

import AnimalFactory.Animal;

public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("Гав Гав!!! Я пёс.");
    }
}
