package Assignment.Q6Q7;
import java.util.*;

public class Peek {



        public static void main(String args[])
        {

            Stack<String> STACK = new Stack<String>();


            STACK.push("Nba");
            STACK.push("is");
            STACK.push("coming");
            STACK.push("at");
            STACK.push("now");

             System.out.println("The Stack is : " + STACK);

            System.out.println("Peek at "
                    + "and the stack is : " + STACK.peek());

            System.out.println("The last stack: " + STACK);
        }
    }

