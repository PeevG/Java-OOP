package p03_Animals;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Kotka", "koteshka hrana");
        Animal dog = new Cat("kuche", "mryvka");

        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());
    }
}
