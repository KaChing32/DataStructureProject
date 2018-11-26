package Assignment.Q3;


public class RandomShapes {
    public static void main(String[] args) {
        double ranX, ranY, ranRad, ranWid, ranHeig;

        Ashape[] shapes = new Ashape[5];

        for (int i = 0; i < shapes.length; i++) {
            int CorR = (int) (Math.random() * 2 + 1);

            ranX = (int) ((Math.random() * 100) + 1);
            ranY = (int) ((Math.random() * 100) + 1);
            ranRad = (int) ((Math.random() * 100) + 1);
            ranWid = (int) ((Math.random() * 100) + 1);
            ranHeig = (int) ((Math.random() * 100) + 1);

            if (CorR == 1) {
                shapes[i] = new Circle(ranX, ranY);
                ((Circle) shapes[i]).setRadius(ranRad);
                System.out.println("\nnumber" + (i+1) + shapes[i].toString());
            } else {
                shapes[i] = new Rectangle(ranX, ranY);
                ((Rectangle) shapes[i]).setHei(ranHeig);
                ((Rectangle) shapes[i]).setWid(ranWid);
                System.out.println("\nnumber" + (i+1) + shapes[i].toString());
            }
        }
    }
}
