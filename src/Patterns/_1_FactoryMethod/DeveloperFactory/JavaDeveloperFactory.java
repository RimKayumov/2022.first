package Patterns._1_FactoryMethod.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer developerCreate() {
        return new JavaDeveloper();
    }
}
