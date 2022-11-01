package animals;

public class Tiger extends Animal implements Eating {
    @Override
    public void eat() {
        System.out.println("Tiger is eating.");
    }
}
