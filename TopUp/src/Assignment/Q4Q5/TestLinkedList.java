package Assignment.Q4Q5;

import Assignment.Q6Q7.LinkedList;


public class TestLinkedList {
    public static void main (String args[]) {
        LinkedList s = new LinkedList();
        System.out.println(s);
        System.out.println();

        s.addToTail (new Integer(99));
        System.out.println(s);
        System.out.println();
        s.addToTail (new Character('b'));
        System.out.println(s);
        System.out.println();
        s.addToTail (new String("Hi"));
        System.out.println(s);
        System.out.println();
        while (!s.isEmpty()) {
            System.out.println("removed:" + s.removeFromHead());
            System.out.println(s);
            System.out.println();
        }

        s.addToHead (new Integer(32));
        System.out.println(s);
        System.out.println();
        s.addToHead (new Character('B'));
        System.out.println(s);
        System.out.println();
        s.addToHead (new String("Hi"));
        System.out.println(s);
        System.out.println();
        while (!s.isEmpty()) {
            System.out.println("removed:" + s.removeFromTail());
            System.out.println(s);
            System.out.println();
        }
    }
}
