package strings;

import java.util.Scanner;

public class Strings_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (i != 1) {
                if (strings[i].length() < strings[1].length()) {
                    System.out.println(strings[i] + " length=:" + strings[i].length());
                }
            }
        }
    }
}
