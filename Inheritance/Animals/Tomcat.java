package animals;

public class Tomcat extends Cat {
    final static String GENDER_TYPE = "Male";

    public Tomcat(String name, int age) {
        super(name, age, GENDER_TYPE);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
