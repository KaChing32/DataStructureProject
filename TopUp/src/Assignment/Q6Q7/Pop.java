package Assignment.Q6Q7;
import java.util.*;

public class Pop {

        public static void main(String args[])
        {
            Stack<String> STACK = new Stack<String>();

            STACK.push("Hi");
            STACK.push("This");
            STACK.push("is");
            STACK.push("Stack");
            STACK.push("case");

            System.out.println(" Stack: " + STACK);

            System.out.println("Stack is : " +
                    STACK.pop());
            System.out.println("Stack is: " +
                    STACK.pop());

            System.out.println("Final Stack"
                    + STACK);
        }
    }

