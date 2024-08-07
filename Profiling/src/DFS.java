import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    private int V;
    private ArrayList<Integer>[] adj;

    public DFS(int v) {
        V = v;
        adj = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void dfs(int v) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(v);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                for (int neighbor : adj[node]) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
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
