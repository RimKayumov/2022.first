package AnimalFactory;

import AnimalFactory.Animal;

public class Mouse implements Animal {
    @Override
    public void say() {
        System.out.println("Пипипи!!! Я мышка.");
    }
}
