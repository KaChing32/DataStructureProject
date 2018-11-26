package Assignment.Q13;
import java.util.*;




class DFS
{
    private int V; // No. of vertices

    // Array of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    DFS(int n)
    {
        V = n;
        adj = new LinkedList[n];
        for (int i=0; i<n; ++i)
            adj[i] = new LinkedList();
    }

    void node(int e, int s)
    {
        adj[e].add(s);
    }

    void dfs(int e, boolean see[])
    {
        see[e] = true;
        System.out.print(e+" ");



        Iterator<Integer> a = adj[e].listIterator();
        while (a.hasNext())
        {
            int n = a.next();
            if (!see[n])
                dfs(n,see);
        }
    }

    void DFS()
    {

        boolean see[] = new boolean[V];


        for (int i=0; i<V; ++i)
            if (see[i] == false)
                dfs(i, see);
    }

    public static void main(String args[])
    {
        DFS n = new DFS(4);

        n.node(1, 1);
        n.node(1, 2);
        n.node(1, 3);
        n.node(2, 1);
        n.node(2, 2);
        n.node(2, 3);

        System.out.println("DFS");

        n.DFS();
    }
}
