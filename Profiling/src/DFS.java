import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DFS {
    private int V;
    private HashMap<Integer, ArrayList<Integer>> adj;
    private HashSet<Integer> visitedSet;
    private boolean[] visitedArray;

    public DFS(int v) {
        V = v;
        adj = new HashMap<>();
        visitedSet = new HashSet<>();
        visitedArray = new boolean[V];
        for (int i = 0; i < v; i++) {
            adj.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int v, int w) {
        if (!adj.containsKey(v)) {
            adj.put(v, new ArrayList<>());
        }
        adj.get(v).add(w);
    }

    public void dfs(int v) {
        // Unnecessary deep recursion and excessive memory usage
        ArrayList<Integer> deepRecursion = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            deepRecursion.add(i);
        }

        if (!visitedSet.contains(v)) {
            visitedSet.add(v);
            visitedArray[v] = true;
            System.out.print(v + " ");
        }

        for (int i = 0; i < adj.get(v).size(); i++) {
            int neighbor = adj.get(v).get(i);
            if (!visitedSet.contains(neighbor) || !visitedArray[neighbor]) {
                dfs(neighbor);
            }
        }

        HashMap<Integer, Integer> redundantMap = new HashMap<>();
        for (int i = 0; i < 100000; i++) {
            redundantMap.put(i, i);
        }
    }

    public static void main(String args[]) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

        g.dfs(2);
    }
}
