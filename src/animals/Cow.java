package animals;

public class Cow extends Animal implements Eating {
    @Override
    public void eat() {
        System.out.println("Cow is eating.");
    }
}
