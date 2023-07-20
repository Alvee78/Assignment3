package class19.E14;

import java.util.Random;

public class RandomPrice {
    public float result(){
        Random generator = new Random();
        return generator.nextFloat(1);
    }
}
