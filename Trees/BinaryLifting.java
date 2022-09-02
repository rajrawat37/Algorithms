//My Implementation

//Binary Lifting using DFS      

//finding depth to help find LCA easily

//2^x = 2^x-1 + 2^x-1
//used this to form the recurrence relation

public static void dfs(int node , int par) {
              up[node][0] = par;
              for (int i = 1; i < 20; i++) {
                     if (up[node][i - 1] >= 0)
                            up[node][i] = up[up[node][i - 1]][i - 1];
                     else
                            up[node][i] = -1;
              }
              for (int child : adj[node]) {
                     if (child == par) continue;
                     depth[child] = depth[node] + 1;
                     dfs(child, node);
              }
       }
//Finding LCA for each query

    int query = sc.nextInt();
              while (query-- > 0) {
                     int u = sc.nextInt();
                     int v = sc.nextInt();
                      
                   //swapping if u is greater than v
                     if (depth[u] < depth[v]) {
                            int temp = u;
                            u = v;
                            v = temp;
                     }
                     //always u is greater !
                     int k = depth[u] - depth[v];
                     for (int i = 19; i >= 0; i--) {
                            if (((1 << i) & k) > 0) {   //if the ith bit is set in k than shift u 2^i node up
                                   u = up[u][i];
                            }
                     }
                     if (u == v) {
                       //if both are found equal than this is the LCA
                       //cases when u is LCA of v or v is LCA of u
                            System.out.println(u);
                     } else {
                       //case when u and v lies of different side of LCA
                            for (int i = 19; i >= 0; i--) {
                              //find the maximum 2^ith node that is not same in both of them
                                   if (up[u][i] != up[v][i]) {
                                          u = up[u][i];
                                          v = up[v][i];
                                   }
                            }
                          //now we will be always at a child node of ancestor 
                            System.out.println(up[u][0]); // or up[v][0];
                     }
              }
