public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Vlad", "KKK");
        User user2 = (User) user1.clone();
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user1);
    }
}
