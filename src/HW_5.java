import java.util.Random;
import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {

        // Создать двумерный массив, заполнить его числами.
        // Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        // Найти сумму всех получившихся элементов.
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                array[i][j] = array[i][j] + scanner.nextInt();
                sum = sum + array[i][j];
            }
        }
        System.out.println("sum=" + sum);

        for (int[] ints : array) {
            for (int j : ints) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Создать программу для раскраски шахматной доски с помощью цикла.
        // Создать двумерный массив String'ов 8х8.
        // С помощью циклов задать элементам циклам значения B(Black) или W(White).
        // Результат работы программы:
        //
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        String[][] chest = new String[8][8];
        for (int i = 0; i < chest.length; i++) {
            for (int j = 0; j < chest[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    chest[i][j] = "W";
                } else if (i % 2 == 1 && j % 2 == 1) {
                    chest[i][j] = "W";
                } else {
                    chest[i][j] = "B";
                }
            }
        }

        for (String[] strings : chest) {
            for (String j : strings) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
