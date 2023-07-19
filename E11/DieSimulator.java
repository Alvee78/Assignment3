package class19.E11;

import java.util.Random;

public class DieSimulator {
    public int result(){
        Random generator = new Random();
        return generator.nextInt(1,7);
    }
}
