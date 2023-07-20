package class19.E14;

public class RandomPriceRunner {
    public static void main(String[] args) {
        RandomPrice randomPrice = new RandomPrice();
        System.out.printf("%.2f",10+(19.95-10)*randomPrice.result());
    }
}
