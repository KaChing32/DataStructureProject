package Assignment.Q6Q7;



    public class TestStack {
        public static void main (String args[]) {
            ListStack n = new ListStack();
            System.out.println(n);

            System.out.println("I am " + n.search("London"));

            n.push(new Character('K'));
            System.out.println(n);
            n.push(new Character('O'));
            System.out.println(n);
            n.push("Yum");
            System.out.println(n);
            n.push("My");
            System.out.println(n);
            n.push(new Integer(111));
            System.out.println(n);
            n.push("London");
            System.out.println(n);
            n.push(new Double(555.9));
            System.out.println(n);


            System.out.println("peek() returns: " + n.peek());

            System.out.println("London list at " + n.search("London"));
            System.out.println("K age is " + n.search(new Character('K')));
            System.out.println("555.9 list at" + n.search(new Double(555.9)));
            System.out.println("England list at " + n.search("London"));
            System.out.println();
        }

    }

