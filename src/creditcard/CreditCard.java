package creditcard;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
public class CreditCard {
    int accountNumber;
    double balance;

    public CreditCard(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    void withdraw(double amount) {
        balance = balance - amount;
    }

    // Добавьте метод, который выводит текущую информацию о карточке.
    void printInfo() {
        System.out.println("Account number = " + accountNumber);
        System.out.println("Balance = " + balance);
    }
}