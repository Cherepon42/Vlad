import java.util.Random;
import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {

        // 1.1
        int monthNumber = new Random().nextInt(13);
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Wrong data");
        }

        // 1.2
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Зима");
            System.out.println("Winter");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Весна");
            System.out.println("Spring");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Лето");
            System.out.println("Summer");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Осень");
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong data");
        }

        // 1.3
        if (monthNumber % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // 1.4
        int temperature = -5;
        if (temperature > -5) {
            System.out.println("Тепло");
        } else if (temperature > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }

        // 2.1
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 2.2
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // 2.3
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 2.4
        int i = 7;
        while (i < 100) {
            if(i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        // 2.5
        int m = 0;
        for (int j = 0; j < 10; j++) {
            System.out.print(m + " ");
            m-=5;
        }
        System.out.println();

        // 2.6
        for (int n = 10; n <= 20;n++) {
            System.out.println(n*n);
        }
    }
}
