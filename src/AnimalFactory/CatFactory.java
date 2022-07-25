package AnimalFactory;

import AnimalFactory.AnimalFactory;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal animalCreate() {
        return new Cat();
    }
}
