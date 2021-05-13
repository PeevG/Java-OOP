package animals;

public class Kitten extends Cat {
    final static String GENDER_TYPE = "Female";

    public Kitten(String name, int age) {
        super(name, age, GENDER_TYPE);

    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
