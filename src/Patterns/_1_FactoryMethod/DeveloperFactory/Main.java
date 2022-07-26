package Patterns._1_FactoryMethod.DeveloperFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String developer = scan.next();

            scan.close();

            DeveloperFactory df = developerFactoryCreate(developer);
            Developer dev = df.developerCreate();
            dev.writeCode();

    }
    static DeveloperFactory developerFactoryCreate(String developer) {
        if (developer.equalsIgnoreCase("java")) return new JavaDeveloperFactory();
        else if (developer.equalsIgnoreCase("c++")) return new CppDeveloperFactory();
        else throw new RuntimeException(developer + " is unknown developer");
    }
}
