package hens;

public class RussianHen extends Hen {

    @Override
    public String getDescription() {
        return super.getDescription() + "My country is Russia. I lay " + getCountOfEggsPerMonth() + " eggs every month";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 1;
    }
}
