package Assignment.Q3;

abstract public class Ashape implements Shape {

    protected double xs;
    protected double ys;


    public Ashape(double x, double y) {
        xs = x;
        ys = y;
    }

    public void move(double XL, double YL) {
        xs = XL;
        ys = YL;
    }

    public double getX() {
        return xs;
    }

    public double getY() {
        return ys;
    }

    public String toString() {
        String message = "X position: " + xs
                + "\nY position: " + ys;
        return message;
    }
}
