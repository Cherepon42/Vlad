package strings;

import java.util.Scanner;

public class Strings_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        String stringWithUniqueChars = null;
        for (int i = 0; i < strings.length; i++) {

            String bufferedString = strings[i];
            for (int j = 0; j < bufferedString.length(); j++) {
                String restOfString = bufferedString.substring(j + 1);
                String charSequence = String.valueOf(bufferedString.charAt(j));
                if (restOfString.contains(charSequence)) {
                    break;
                } else if (j == bufferedString.length() - 1) {
                    stringWithUniqueChars = bufferedString;
                    i = strings.length;
                }
            }
        }
        System.out.println(stringWithUniqueChars);
    }
}
