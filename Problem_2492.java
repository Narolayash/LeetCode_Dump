import java.util.ArrayList;
import java.util.List;

public class Problem_2492 {
    public int dfs(List<int[]> graph[], boolean[] visited, int src, int min) {
        visited[src] = true;

        for (int[] edges : graph[src]) {
            min = Math.min(min, edges[1]);

            if (!visited[edges[0]]) {
                min = dfs(graph, visited, edges[0], min);
            }
        }

        return min;
    }

    public int minScore(int n, int[][] roads) {
        List<int[]> graph[] = new ArrayList[n + 1];

        for (int i=1; i<=n; i++) {
            graph[i] = new ArrayList();
        }

        for (int[] road : roads) {
            graph[road[0]].add(new int[] { road[1], road[2] });
            graph[road[1]].add(new int[] { road[0], road[2] });
        }

        boolean[] visited = new boolean[n + 1];
        int min = dfs(graph, visited, 1, Integer.MAX_VALUE);

        return min;
    }
}
