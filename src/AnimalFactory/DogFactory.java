package AnimalFactory;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal animalCreate() {
        return new Dog();
    }
}
