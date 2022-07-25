package AnimalFactory;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.next();
        scan.close();

        AnimalFactory animalFactory = createAnimalByKind(command);
        Animal animal = animalFactory.animalCreate();
        animal.say();
    }

    static AnimalFactory createAnimalByKind(String command) {
        if (command.equalsIgnoreCase("cat")) return new CatFactory();
        else if (command.equalsIgnoreCase("dog")) return new DogFactory();
        else if (command.equalsIgnoreCase("mouse")) return new MouseFactory();
        else throw new RuntimeException(command + " is unknown animal");
    }
}
