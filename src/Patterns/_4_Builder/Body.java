package Patterns._4_Builder;

public class Body {
    Body(BodyBuilder bodyBuilder){
        this.weight = bodyBuilder.getWeight();
        this.yearsOld = bodyBuilder.getYearsOld();
        this.nationality = bodyBuilder.getNationality();
        this.name = bodyBuilder.getName();
    }
    private final float weight;
    private final int yearsOld;
    private final String nationality;
    private final String name;

    @Override
    public String toString() {
        return "Body{" +
                "weight=" + weight +
                ", yearsOld=" + yearsOld +
                ", nationality='" + nationality + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
