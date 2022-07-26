package Patterns._2_AbstractFactory;

public interface ActionFactory {
    Animal getAnimal();
    Human getHuman();
    Item getItem();
}
