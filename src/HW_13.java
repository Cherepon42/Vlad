import java.util.ArrayDeque;

public class HW_13 {
    private ArrayDeque<String> animals = new ArrayDeque<>();

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
