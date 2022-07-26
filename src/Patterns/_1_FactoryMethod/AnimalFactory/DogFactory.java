package Patterns._1_FactoryMethod.AnimalFactory;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal animalCreate() {
        return new Dog();
    }
}
