package Patterns._4_Builder;

public class Main {
    public static void main(String[] args) {
        Body body = new BodyBuilder().name("Ivan").nationality("Russian").yearsOld(35).weight(95).build();
        System.out.println(body.toString());
    }
}
