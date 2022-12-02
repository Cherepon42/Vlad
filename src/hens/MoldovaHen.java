package hens;

public class MoldovaHen extends Hen {

    @Override
    public String getDescription() {
        return super.getDescription() + "My country is Moldova. I lay " + getCountOfEggsPerMonth() + " eggs every month";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 3;
    }
}
