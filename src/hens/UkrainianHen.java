package hens;

public class UkrainianHen extends Hen {

    @Override
    public String getDescription() {
        return super.getDescription() + "My country is Ukraine. I lay " + getCountOfEggsPerMonth() + " eggs every month";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 2;
    }
}
