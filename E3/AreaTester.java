package class19.E3;

import java.awt.Rectangle;

public class AreaTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0,0,5,4);
        double area = rectangle.getHeight() * rectangle.getWidth();
        System.out.println(area);
    }
}
