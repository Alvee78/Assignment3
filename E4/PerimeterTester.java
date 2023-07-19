package class19.E4;

import java.awt.Rectangle;

public class PerimeterTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0,0,4,5);
        System.out.println(2 * (rectangle.getHeight() + rectangle.getWidth()));
    }
}
