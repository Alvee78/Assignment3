package class19.E6;

import java.awt.*;

public class AddTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println("Expected x = "+box.getX()+" Expected y = "+box.getY());
        box.add(0, 0);
        System.out.println("Final x = "+box.getX()+" Final y = "+box.getY());
    }
}
