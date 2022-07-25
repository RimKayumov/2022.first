package AnimalFactory;

public class MouseFactory implements AnimalFactory{
    @Override
    public Animal animalCreate() {
        return new Mouse();
    }
}
