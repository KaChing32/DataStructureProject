package Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight ;
        double height ;

        System.out.print("Enter your weight in （kg): ");
        weight = input.nextDouble();

        System.out.print("Enter your height in （m）: ");
        height = input.nextDouble();

        double fc = (weight / (height * height));

        if (fc > 25) {
            System.out.println("Too Fat, need to keep fit!” in the result line");

        } else if (fc < 15) {
            System.out.println("Too Thin, need to keep fat!” in the result line");
        } else {
            System.out.println("Just fit, keep on!” in the result line");
        }
    }
}