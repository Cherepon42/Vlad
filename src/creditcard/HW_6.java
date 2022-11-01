package creditcard;

public class HW_6 {
    public static void main(String[] args) {
        // Напишите программу, которая создает три объекта класса credit.card.CreditCard у которых заданы номер счета и начальная сумма
        CreditCard card_1 = new CreditCard(123, 100.0);
        CreditCard card_2 = new CreditCard(222, 200.0);
        CreditCard card_3 = new CreditCard(333, 300.0);
        // Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
        card_1.deposit(40);
        card_2.deposit(80);
        card_3.withdraw(40);
        // Выведите на экран текущее состояние всех трех карточек.
        card_1.printInfo();
        card_2.printInfo();
        card_3.printInfo();
    }


}
