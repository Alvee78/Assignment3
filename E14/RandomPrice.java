package class19.E14;

import java.util.Random;

public class RandomPrice {
    public double result(){
        Random generator = new Random();
        return generator.nextDouble(10,19.96);
    }
}
