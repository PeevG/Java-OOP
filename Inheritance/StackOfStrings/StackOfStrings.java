import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings(ArrayList<String> data) {
        this.data = data;
    }



    public void push(String s) {
        this.data.add(s);
    }

    public String pop() {
        return this.data.remove(this.data.size() -1);
    }

    public String peek() {
        return this.data.get(this.data.size() -1);
    }

    public boolean isEmpty(ArrayList list) {
       if(list.isEmpty()) {
           return true;
       } return false;
    }
}
