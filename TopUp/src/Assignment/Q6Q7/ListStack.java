package Assignment.Q6Q7;
import java.util.EmptyStackException;




    public class ListStack extends LinkedList {

        public ListStack() {
            super();
        }

        public boolean empty() {
            return isEmpty();
        }

        public Object push(Object item) {
            addToHead(item);
            return item;
        }

        public Object pop() throws EmptyStackException {
            if (empty()) throw new EmptyStackException();
            return removeFromHead();
        }

        public Object peek() {
            if (empty()) throw new EmptyStackException();
            return get(1);
        }

        public int search(Object item) {


            if (empty()) return -1;
            ListNode current = head;
            for (int i = 1; i <= length; i++) {
                if (item.equals(current.getData())) return i;
                current = current.getNext();
            }
            return -1;

        }


            }
