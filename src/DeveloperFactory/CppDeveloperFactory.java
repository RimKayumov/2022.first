package DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer developerCreate() {
        return new CppDeveloper();
    }
}
