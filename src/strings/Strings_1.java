package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Strings_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        String minStr = strings[0];
        String maxStr = strings[1];
        for (String string : strings) {
            if (minStr.length() > string.length()) {
                minStr = string;
            }
            if (maxStr.length() < string.length()) {
                maxStr = string;
            }
        }

        System.out.println(Arrays.toString(strings));
        System.out.println("max=:" + maxStr + " length=:" + maxStr.length());
        System.out.println("min=:" + minStr + " length=:" + minStr.length());
    }
}
