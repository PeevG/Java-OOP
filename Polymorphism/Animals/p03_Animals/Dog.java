package p03_Animals;

public class Dog extends Animal {

    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("I am %s and my favourite food is %s", this.getName(), this.getFavouriteFood()));
        sb.append(System.lineSeparator());
        sb.append("DJAAF");
        sb.append(System.lineSeparator());
        return sb.toString().trim();
    }
}
