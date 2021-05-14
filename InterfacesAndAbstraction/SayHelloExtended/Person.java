package p04_SayHelloExtended;

public interface Person {

    String getName();
    default String sayHello() {
        return "";
    }
}
