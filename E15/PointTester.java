package class19.E15;

import java.awt.*;

public class PointTester {
    private Point point = new Point(), point1 = new Point();
    public PointTester(){
        point1.setLocation(-3,-4);
        point.setLocation(3,4);
    }
    public double getDistance(){
        return Math.sqrt(Math.pow(point.getX()-point1.getX(),2)+Math.pow(point.getY()-point1.getY(),2));
    }
}
