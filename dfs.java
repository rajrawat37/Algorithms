public static void dfs(int node, int parent) {
      for (int child : adj[node])
            if (child != parent) {
                dfs(child, node);
            }
    }
