package hens;

public class BelarusianHen extends Hen {

    @Override
    public String getDescription() {
        return super.getDescription() + "My country is Belarus. I lay " + getCountOfEggsPerMonth() + " eggs every month";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 4;
    }
}
