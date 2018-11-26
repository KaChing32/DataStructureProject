package Assignment;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert your total Cholesterol (TC):");
        double TC = input.nextDouble();
        System.out.print("Please insert you HDL cholesterol (HDLC):");
        double HDLC = input.nextDouble();
        System.out.print("Please insert your Triglyceride (TG) :");
        double TG = input.nextDouble();
        double LDLC = TC - HDLC - TG/5;
        System.out.println("Your LDL cholesterol (LDLC) is :" +LDLC);
    }
}
