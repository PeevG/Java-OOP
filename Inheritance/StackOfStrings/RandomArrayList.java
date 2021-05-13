import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayList extends ArrayList {

    public void getRandomElement(List newList) {
        newList.remove(Math.random());
    }
}
