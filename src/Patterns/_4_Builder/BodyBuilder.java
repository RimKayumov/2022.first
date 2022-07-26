package Patterns._4_Builder;

public class BodyBuilder {
    private float weight;
    private int yearsOld;
    private String nationality;
    private String name;

    public BodyBuilder weight(final float weight){
        this.weight = weight;
        return this;
    }
    public BodyBuilder yearsOld(final int yearsOld){
        this.yearsOld = yearsOld;
        return this;
    }
    public BodyBuilder nationality(final String nationality){
        this.nationality = nationality;
        return this;
    }
    public BodyBuilder name(final String name){
        this.name = name;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }

    public Body build(){
        return new Body(this);
    }
}
