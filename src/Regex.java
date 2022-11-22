import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) throws Exception {
        // 1
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        Matcher matcher2 = Pattern.compile("^(((1[0-9]{2})|(2[0-5]{2})|[0-9]{1,2})(\\.)){3}((1[0-9]{2})|(2[0-5]{2})|[0-9]{1,2})$").matcher(ip);
        System.out.println(matcher2.find());
        System.out.println(matcher2.group());

        // 2
        String path = scanner.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        Pattern patternForEmail = Pattern.compile("[^ \n]+@[a-zA-Z]+\\.[a-zA-Z]+");
        Pattern patternForPhone = Pattern.compile("\\+\\([0-9]{2}\\)[0-9]{7}");
        Pattern patternForDocumentNumber = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{2}");
        Map<String, String> stringMap = new HashMap<>();
        while (reader.ready()) {
            String bufferedString = reader.readLine();
            Matcher matcherEmail = patternForEmail.matcher(bufferedString);
            if (matcherEmail.find()) {
                stringMap.put("email", matcherEmail.group());
            }
            Matcher matcherPhone = patternForPhone.matcher(bufferedString);
            if (matcherPhone.find()) {
                stringMap.put("phone number", matcherPhone.group());
            }
            Matcher matcherForDocumentNumber = patternForDocumentNumber.matcher(bufferedString);
            if (matcherForDocumentNumber.find()) {
                stringMap.put("document number", matcherForDocumentNumber.group());
            }
        }
        stringMap.entrySet().forEach(System.out::println);
    }
}
