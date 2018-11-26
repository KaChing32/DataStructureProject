package Assignment.Q3;


public class Rectangle extends Ashape {


    private double Hei;
    private double Wid;

    public Rectangle(double xpos, double ypos) {
        super(xpos, ypos);
    }

    public void setHei(double h) {
        Hei = h;
    }


    public void setWid(double w) {
        Wid = w;
    }

    public double getWidth(double w) {
        return Wid;
    }

    public double area() {
        double area = Hei * Wid;
        return area;
    }

    public double perimeter() {
        double perimeter = (2 * Wid) + (2 * Hei);
        return perimeter;
    }

    public Rectangle clone() {
        Rectangle xq;
        xq = new Rectangle(this.xs, this.ys);
        xq.setHei(this.Hei);
        xq.setWid(this.Wid);
        return xq;
    }

    public boolean equals(Rectangle r) {
        return r.Hei == this.Hei
                && r.Wid == this.Wid
                && r.getX() == this.xs
                && r.getY() == this.ys;
    }

    public String toString() {
        String message = "\n[RECTANGLE]"
                + "\nThe Position is: (" + xs + ", " + ys
                + ")\nThe Height is: " + Hei
                + "\nThe Width is: " + Wid
                + "\nThe Area is: " + this.area()
                + "\nThe Perimeter is: " + this.perimeter();
        return message;
    }
}
