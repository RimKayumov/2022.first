package Patterns._1_FactoryMethod.AnimalFactory;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal animalCreate() {
        return new Cat();
    }
}
