package Patterns._1_FactoryMethod.AnimalFactory;

public class Mouse implements Animal {
    @Override
    public void say() {
        System.out.println("Пипипи!!! Я мышка.");
    }
}
