import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class reflection = Reflection.class;

        System.out.print("class ");
        System.out.println(reflection.getSimpleName());
        System.out.println(reflection.getSuperclass());
        Arrays.stream(reflection.getInterfaces())
                .forEach(i -> System.out.println(i));
        Object reflObj = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflObj);

    }
}
