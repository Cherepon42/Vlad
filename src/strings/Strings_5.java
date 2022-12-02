package strings;

import java.util.Scanner;

public class Strings_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        String result = null;
        for (String bufferedString : strings) {

            for (int j = 0; j < bufferedString.length() / 2; j++) {
                int stringLength = bufferedString.length();
                char firstChar = bufferedString.charAt(j);
                char lastChar = bufferedString.charAt(stringLength - j - 1);

                if (firstChar == lastChar) {
                    if (j == stringLength / 2 - 1) {
                        result = bufferedString;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
