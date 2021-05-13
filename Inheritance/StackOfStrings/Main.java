import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();


        StackOfStrings stackOfStrings = new StackOfStrings(data);

        stackOfStrings.push("edno");
        stackOfStrings.push("dve");

        stackOfStrings.pop();
    }
}
