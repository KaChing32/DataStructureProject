package Assignment.Q6Q7;

public class Queue {






    public static void main(String[] args) {

        class EmptyQueueException extends RuntimeException {
            public EmptyQueueException() {
                super("Queue is empty");
            }
        }

        class QueueFullException extends RuntimeException {
            public QueueFullException() {
                super("Queue is full");
            }
        }}}
