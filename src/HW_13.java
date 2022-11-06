import java.util.ArrayDeque;
import java.util.Queue;

public class HW_13 {
    private Queue<String> animals = new ArrayDeque<>();

    public HW_13() {
        animals.add("Alex");
        animals.add("Barsik");
        animals.add("Pit");
    }

    public void addAnimal(String string) {
        animals.add(string);
    }

    public String removeAnimal() {
        return animals.poll();
    }
}
