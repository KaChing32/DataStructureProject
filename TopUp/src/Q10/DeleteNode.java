package Q10;


    public class DeleteNode
    {
        class Node
        {
            int fact;
            Node l, r;

            public Node(int item)
            {
                fact = item;
                l = r = null;
            }
        }

        Node root;

        DeleteNode()
        {
            root = null;
        }

        void deleteKey(int num)
        {
            root = deleteRec(root, num);
        }


        Node deleteRec(Node root, int num)
        {
            if (root == null) return root;

            if (num < root.fact)
                root.l = deleteRec(root.l, num);
            else if (num > root.fact)
                root.r = deleteRec(root.r, num);

            else
            {
                if (root.l == null)
                    return root.r;
                else if (root.r == null)
                    return root.l;


                root.fact = minValue(root.r);


                root.r = deleteRec(root.r, root.fact);
            }

            return root;
        }

        int minValue(Node root)
        {
            int minv = root.fact;
            while (root.l != null)
            {
                minv = root.l.fact;
                root = root.l;
            }
            return minv;
        }

        void insert(int num)
        {
            root = insertRec(root, num);
        }

        Node insertRec(Node root, int num)
        {

            if (root == null)
            {
                root = new Node(num);
                return root;
            }

            if (num < root.fact)
                root.l = insertRec(root.l, num);
            else if (num > root.fact)
                root.r = insertRec(root.r, num);

            return root;
        }

        void inorder()
        {
            inorderRec(root);
        }

        void inorderRec(Node root)
        {
            if (root != null)
            {
                inorderRec(root.l);
                System.out.print(root.fact + " ");
                inorderRec(root.r);
            }
        }


        public static void main(String[] args)
        {
            DeleteNode tree = new DeleteNode();


            tree.insert(10);
            tree.insert(80);
            tree.insert(50);
            tree.insert(40);
            tree.insert(60);
            tree.insert(70);
            tree.insert(20);

            System.out.println("Inorder of tree");
            tree.inorder();

            System.out.println("\nDelete 60");
            tree.deleteKey(60);
            System.out.println("Modifying tree");
            tree.inorder();

            System.out.println("\nDelete 10");
            tree.deleteKey(10);
            System.out.println("Modifying tree");
            tree.inorder();

            System.out.println("\nDelete 20");
            tree.deleteKey(20);
            System.out.println("Final tree");
            tree.inorder();
        }
    }

