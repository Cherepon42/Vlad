import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Streams {
    public static void main(String[] args) {
        Map<Integer, String> dataOfNames = new HashMap<>();
        dataOfNames.put(1, "Vasya");
        dataOfNames.put(2, "Sasha");
        dataOfNames.put(3, "Dima");
        dataOfNames.put(4, "Vlad");
        dataOfNames.put(13, "Yura");
        List<String> listOfReversedNames = dataOfNames.keySet().stream()
                .filter(id -> id == 1 || id == 2 || id == 5 || id == 8 || id == 9 || id == 13)
                .filter(id -> dataOfNames.get(id).length() % 2 == 1)
                .map(id -> new StringBuilder(dataOfNames.get(id)).reverse().toString())
                .toList();
        listOfReversedNames.forEach(System.out::println);
    }
}
