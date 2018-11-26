package Assignment.Q8;

/**
 * Created by user on 24/11/2018.
 */
public class Binarysearchtree { class sequence  {
    int key;
    sequence  left, right;

    public sequence (int item) {
        key = item;
        left = right = null;
    }

}


    sequence num;


    Binarysearchtree() {
        num = null;
    }


    void insert(int key) {
        num = insertRec(num, key);
    }

    sequence  insertRec(sequence  num, int key) {


        if (num == null) {
            num = new sequence (key);
            return num;
        }


        if (key < num.key)
            num.left = insertRec(num.left, key);
        else if (key > num.key)
            num.right = insertRec(num.right, key);


        return num;
    }


    void order()  {
        order(num);
    }


    void order(sequence  num) {
        if (num != null) {
            order(num.left);
            System.out.println(num.key);
            order(num.right);
        }
    }


    public static void main(String[] args) {
        Binarysearchtree tree = new Binarysearchtree();


        tree.insert(2);
        tree.insert(7);
        tree.insert(9);
        tree.insert(4);
        tree.insert(1);
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(0);
        tree.insert(8);


        tree.order();
    }
}

