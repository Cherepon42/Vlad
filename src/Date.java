import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your date like \"2022-12-31\"");
        LocalDate localDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Day of the week - " + localDate.getDayOfWeek());
        localDate = LocalDate.now();
        if (localDate.getDayOfWeek() == DayOfWeek.TUESDAY) {
            localDate = localDate.plusDays(7);
        } else {
            while (localDate.getDayOfWeek() != DayOfWeek.TUESDAY) {
                localDate = localDate.plusDays(1);
            }
        }
        System.out.println(localDate);
    }
}
