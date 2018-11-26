package Assignment.Q13;


import java.util.*;


    class BFS
    {
        private int n;
        private LinkedList<Integer> adj[];

        BFS(int n)
        {
            this.n = n;
            adj = new LinkedList[n];
            for (int i = 0; i< n; ++i)
                adj[i] = new LinkedList();
        }

        void add(int n, int e)
        {
            adj[n].add(e);
        }

        void BFS(int a)
        {

            boolean saw[] = new boolean[n];

            LinkedList<Integer> line = new LinkedList<Integer>();

            saw[a]=true;
            line.add(a);

            while (line.size() != 0)
            {
                a = line.poll();
                System.out.print(a+" ");


                Iterator<Integer> i = adj[a].listIterator();
                while (i.hasNext())
                {
                    int n = i.next();
                    if (!saw[n])
                    {
                        saw[n] = true;
                        line.add(n);
                    }
                }
            }
        }

        public static void main(String args[])
        {
            BFS g = new BFS(4);

            g.add(0, 1);
            g.add(0, 2);
            g.add(2, 1);
            g.add(2, 2);
            g.add(3, 1);
            g.add(3, 2);

            System.out.println("BFS ");

            g.BFS(3);
        }
    }

