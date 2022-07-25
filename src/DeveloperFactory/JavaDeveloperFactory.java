package DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer developerCreate() {
        return new JavaDeveloper();
    }
}
