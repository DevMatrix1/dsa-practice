import java.util.*;

public class graphs_implementation {

    static int[][] createAdjMatrixDir(int[][] dir_graph){
        int max_el1 = Integer.MIN_VALUE;
        int max_el2 = Integer.MIN_VALUE;

        for(int[] arr: dir_graph){
            max_el1 = Math.max(arr[0], max_el1);
            max_el2 = Math.max(arr[1], max_el2);
        }
        int n = Math.max(max_el1, max_el2) + 1;
        int[][] adjMatrix = new int[n][n];
        for(int[] arr: dir_graph){
            adjMatrix[arr[0]][arr[1]] = 1;
        }

        return adjMatrix;
    }

    static int[][] createAdjMatrixUndir(int[][] undir_graph){
        int max_el1 = Integer.MIN_VALUE;
        int max_el2 = Integer.MIN_VALUE;

        for(int[] arr: undir_graph){
            max_el1 = Math.max(arr[0], max_el1);
            max_el2 = Math.max(arr[1], max_el2);
        }
        int n = Math.max(max_el1, max_el2) + 1;
        int[][] adjMatrix = new int[n][n];
        for(int[] arr: undir_graph){
            adjMatrix[arr[0]][arr[1]] = 1;
            adjMatrix[arr[1]][arr[0]] = 1;
        }

        return adjMatrix;
    }

    static void printAdjMatrix(int[][] adjMatrix){
        System.out.println();
        for(int arr[]: adjMatrix){
            for(int a: arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    static void bfs(int[][] mat){
        System.out.println("BFS -> ");
        HashSet<Integer> set = new HashSet<>();
        int n = mat.length;
        for(int i = 0; i<n; i++){
            if(set.contains(i))
                continue;
            set.add(i);
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            while(q.size() > 0){
                int row = q.poll();
                System.out.print(row+" ");
                for(int col = 0; col < n; col++){
                    if(mat[row][col] == 1 && set.contains(col) == false){
                        set.add(col);
                        q.offer(col);
                    }
                }
            }
        }
        System.out.println();
    }

    static void dfs(int[][] mat){   
        System.out.println("DFS -> ");
        HashSet<Integer> set = new HashSet<>();
        int n = mat.length;
        for(int i = 0; i<n; i++){
            if(set.contains(i))
                continue;
            set.add(i);
            Stack<Integer> st = new Stack<>();
            st.push(i);
            while(st.size() > 0){
                int row = st.pop();
                System.out.print(row+" ");
                for(int col = 0; col < n; col++){
                    if(mat[row][col] == 1 && set.contains(col) == false){
                        set.add(col);
                        st.push(col); 
                    }
                }
            }
        }
        System.out.println();
    }

    static void detect_cycle_undir_bfs(int[][] mat){
        HashSet<Integer> visited = new HashSet<>();
        int n = mat.length;
        for(int i = 0; i<n; i++){
            if(visited.contains(i))
                continue;
            visited.add(i);
            Queue<int[]> q = new LinkedList<int[]>();
            q.add(new int[]{i, -1});
            while(q.size() > 0){
                int[] curr = q.poll();
                int row = curr[0];
                int par = curr[1];
                System.out.print(row+" ");
                for(int col = 0; col < n; col++){
                    if(mat[row][col] == 1){
                        if(visited.contains(col) == false){
                            visited.add(col);
                            q.offer(new int[]{col, row});
                        } else if(col != par){
                            System.out.printf("\n Cycle found at %d - %d \n", row, col);
                            return;
                        }
                    }
                }
            }
        }
        
        System.out.printf("\n No cycle detected! \n");
    }

    static void detect_cycle_undir_dfs(int[][] mat){
        HashSet<Integer> vis = new HashSet<>();
        int n = mat.length;
        for(int i = 0; i<n; i++){
            if(vis.contains(i))
                continue;
            vis.add(i);
            Stack<int[]> st = new Stack<>();
            st.push(new int[]{i, -1});
            while(st.size() > 0){
                int[] cur = st.pop();
                int row = cur[0];
                int par = cur[1];
                System.out.print(row+" ");
                for(int col = 0; col < n; col++){
                    if(mat[row][col] == 1){
                        if(vis.contains(col) == false){
                            vis.add(col);
                            st.push(new int[]{col, row}); 
                        } else if(col != par){
                            System.out.printf("\n Cycle found at %d - %d \n", row, col);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("No cycle detected!");
    }
    
    static boolean dfs_recursive(int row, int par, int[][] mat, HashSet<Integer> vis){
        System.out.print(row+" ");
        for(int col = 0; col < mat[row].length; col++){
            if(mat[row][col] == 1){
                if(vis.contains(col) == false){
                    vis.add(col);
                    if(dfs_recursive(col, row, mat, vis)){
                        return true;
                    }
                } else if(col != par){
                    System.out.printf("\n Cycle found at %d - %d \n", row, col);
                    return true;
                }
            }
        }

        return false;
    }
    static void detect_cycle_undir_dfs_recursive(int[][] mat){
        HashSet<Integer> vis = new HashSet<>();
        int n = mat.length;
        for(int i = 0; i<n; i++){
            if(vis.contains(i))
                continue;
            if(dfs_recursive(i, -1, mat, vis))
                return;
        }
        System.out.println("No cycle detected!");
    }

    static boolean dfs_recursive_path(int[][] mat, HashSet<Integer> vis, HashSet<Integer> path, int el){
        vis.add(el);
        path.add(el);
        for(int col = 0; col < mat.length; col++){
            if(mat[el][col] == 1) {
                if(vis.contains(col) == false){
                    if(dfs_recursive_path(mat, vis, path, col)){
                        return true;
                    }
                } else if(path.contains(col)){
                    System.out.printf("\n cycle found at %d - %d \n", el, col);
                    return true;
                }
            }
        }
        path.remove(el);
        return false;
    }
    static void detect_cycle_dir_dfs_recursive(int[][] mat){
        HashSet<Integer> vis = new HashSet<>();
        int n = mat.length;
        for(int i = 0; i<n; i++){
            if(vis.contains(i))
                continue;
            if(dfs_recursive_path(mat, vis, new HashSet<Integer>(), i))
                return;
        }
        System.out.println("No cycle detected!");
    }
    public static void main(String[] args) {


        int[][] undir_graph = {{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 4}, {5, 7}, {7, 6}};
        int[][] dir_graph = {{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 4}, {5, 7}, {7, 6}, {6, 5}};
        
        int[][] adj_undir = createAdjMatrixUndir(undir_graph);
        int[][] adj_dir = createAdjMatrixDir(dir_graph);

        printAdjMatrix(adj_undir);
        printAdjMatrix(adj_dir);

        bfs(adj_undir);
        dfs(adj_undir);        
        bfs(adj_dir);
        dfs(adj_dir);

        detect_cycle_undir_bfs(adj_undir);
        detect_cycle_undir_dfs(adj_undir);
        detect_cycle_undir_dfs_recursive(adj_undir);
        detect_cycle_dir_dfs_recursive(adj_dir);

    }
}
