import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        Predicate<String> isStartAndEnd = (string) -> string.charAt(0) == 'N' && string.charAt(string.length() - 1) == 'A';
        System.out.println(isStartAndEnd.test("Never"));
        System.out.println(isStartAndEnd.test("NeverA"));
        Consumer<Box> printWeight = (box) -> System.out.println("Отгрузили ящик с весом " + box.getWeight());
        printWeight.accept(new Box(12));
        Function<Integer, String> isPositiveNumber = (integer) -> {
            if (integer < 0) {
                return "Отрицательное число";
            } else if (integer > 0) {
                return "Положительное число";
            } else {
                return "Ноль";
            }
        };
        System.out.println(isPositiveNumber.apply(1));
        System.out.println(isPositiveNumber.apply(-1));
        System.out.println(isPositiveNumber.apply(0));
        Supplier<Integer> getRandomNumber = () -> (int) (Math.random() * 10);
        System.out.println(getRandomNumber.get());
        BinaryOperator<String> s = (s1, s2) -> (s1);
        System.out.println(s.apply("123", "1"));
    }

    static class Box {
        private int weight;

        public Box(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }
}

