package restaurant;

public class Main {
    public static void main(String[] args) {


        Cake cake = new Cake("Torta");
        System.out.println(cake.getCalories());
        System.out.println(cake.getGrams());
        System.out.println(cake.getName());
        System.out.println(cake.getPrice());

        Coffee coffee = new Coffee("Cherno", 15);
        System.out.println(coffee.getCaffeine());
        System.out.println(coffee.getMilliliters());
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());
    }
}
