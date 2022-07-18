package FirstPac;


import java.util.Scanner;

public class Main {
    public static class CalcMe {
        static public double ThisValues(double a, double b, char c) {
            switch (c) {
                case '+': {
                    return a+b;
                }
                case '-': {
                    return a-b;
                }
                case '/': {
                    return a/b;
                }
                case '*': {
                    return a*b;
                }
                default:
                    System.out.print("Bye Bye! ");
            }
            return a+b;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 2 values: ");
        double num1 = 0; double num2 = 0; char c;
        num1 = in.nextDouble();
        c = in.next().charAt(0);
        num2 = in.nextDouble();
        System.out.println(CalcMe.ThisValues(num1, num2, c));
    }
}
