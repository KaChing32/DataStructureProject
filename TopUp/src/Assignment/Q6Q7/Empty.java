package Assignment.Q6Q7;
import java.util.*;


public class Empty {


        public static void main(String[] args)
        {

            Stack<String> STACK = new Stack<String>();

            STACK.push("NBA");
            STACK.push("24");
            STACK.push("Kobe");
            STACK.push("Hello");
            STACK.push("I");

            System.out.println("The stack is: " + STACK);

            System.out.println("The stack is empty? " +
                    STACK.empty());

            STACK.pop();
            STACK.pop();
            STACK.pop();
            STACK.pop();
            STACK.pop();

            System.out.println("Is stack empty? " +
                    STACK.empty());
        }
    }

