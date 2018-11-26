package Assignment.Q6Q7;
import java.util.*;

public class Push {



        public static void main(String[] args)
        {


            Stack<String> STACK = new Stack<String>();


            STACK.push("Hi");
            STACK.push("This");
            STACK.push("Is");
            STACK.push("Stack");
            STACK.push("case");


            System.out.println("The stack is: " + STACK);

            System.out.println("Is the stack said 'hi'? "
                    + STACK.search("hi"));

            System.out.println("Is the stack with capital 'S'? "
                    + STACK.search("Stack"));


            System.out.println("Does stack with 'Is'? "
                    + STACK.search("Is"));
        }

}
