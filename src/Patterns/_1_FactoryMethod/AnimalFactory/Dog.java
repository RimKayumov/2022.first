package Patterns._1_FactoryMethod.AnimalFactory;

public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("Гав Гав!!! Я пёс.");
    }
}
