package strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Strings_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
