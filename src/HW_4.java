import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        //Для всех задач исходные условия следующие:
        // пользователь с клавиатуры вводит размер массива (просто целое число).
        // После того, как размер массива задан, заполнить его одним из двух способов:
        // используя Math.random(), или каждый элемент массива вводится пользователем вручную.
        // Попробовать оба варианта.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size of array.");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Please enter values.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        //1. пройти по массиву, вывести все элементы в прямом и в обратном порядке
        for (int number : array) {
            System.out.println(number);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        //2. найти минимальный-максимальный элементы и вывести
        //3. найти индекс минимального-максимального элементов и вывести
        int max = array[0];
        int min = array[0];
        int indexOfMaxValue = 0;
        int indexOfMinValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMaxValue = i;
            }
            if (array[i] < min) {
                indexOfMinValue = i;
                min = array[i];
            }
        }

        System.out.println("Max value: " + max + "\n" + "Min value: " + min);
        System.out.println("IndexMax value: " + indexOfMaxValue + "\n" + "IndexMin value: " + indexOfMinValue);

        //4. найти и вывести количество нулевых элементов.
        // Если нулевых элементов нет - вывести сообщение, что их нет
        int sumOfZeroElements = 0;
        for (int j : array) {
            if (j == 0) {
                sumOfZeroElements++;
            }
        }
        if(sumOfZeroElements > 0) {
            System.out.println("Total number of nulls: " + sumOfZeroElements);
        } else {
            System.out.println("Null value does not exist");
        }

        //5. пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.
        int buff;
        for (int i = 0; i < array.length/2; i++) {
            buff = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = buff;
        }
        for (int number : array) {
            System.out.println(number);
        }

        //6. проверить, является ли массив возрастающей последовательностью
        // (каждое следующее число больше предыдущего)
        int previousValue = array[0];
        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if(previousValue > array[i]) {
                isIncreasing = false;
                break;
            } else {
                previousValue = array[i];
            }
        }

        if (isIncreasing) {
            System.out.println("Increasing sequence");
        } else {
            System.out.println("Not an increasing sequence");
        }

    }
}