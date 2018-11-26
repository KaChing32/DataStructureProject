package Assignment.Q3;

/**
 * Created by user on 25/11/2018.
 */
public interface Shape {
    public double area();
    public double perimeter();
    public double getX();
    public double getY();
    public void move(double xLoc, double yLoc);
    public String toString();
}