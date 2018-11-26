package Assignment.Q3;

/**
 * Created by user on 25/11/2018.
 */

    public class Circle extends Ashape {

        private double radius;

        public Circle(double XP, double YP) {
            super(XP, YP);
        }

        public void setRadius(double q) {
            radius = q;
        }

        public double getRadius() {
            return radius;
        }

        public double area() {
            double area = Math.PI * Math.pow(radius, 2);
            return area;
        }

        public double perimeter() {
            double perimeter = 2 * Math.PI * radius;
            return perimeter;
        }

        public Circle clone() {
            Circle theClone;
            theClone = new Circle(this.xs, this.ys);
            theClone.setRadius(this.radius);
            return theClone;
        }

        public boolean equals(Circle c) {
            return c.radius == this.radius
                    && c.getX() == this.xs
                    && c.getY() == this.ys;
        }

        public String toString() {
            String message = "\n[CIRCLE]"
                    + "\nPosition: (" + xs + ", " + ys
                    + ")\nRadius: " + radius
                    + "\nArea: " + this.area()
                    + "\nCircumference: " + this.perimeter();
            return message;
        }
    }

