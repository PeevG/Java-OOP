package p03_Animals;

public class Cat extends Animal {

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("I am %s and my favourite food is %s", this.getName(), this.getFavouriteFood()));
        sb.append(System.lineSeparator());
        sb.append("MEEOW");
        sb.append(System.lineSeparator());
        return sb.toString().trim();
    }
}
