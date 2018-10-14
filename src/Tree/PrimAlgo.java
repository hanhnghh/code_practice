package Tree;

public class PrimAlgo {

    private static int minKey(int[] key, boolean[] mstSet){
        int min = Integer.MAX_VALUE;
        int minVertex = -1;

        for(int i = 0; i < key.length; i++){
            if(!mstSet[i] && key[i] <= min){
                min = key[i];
                minVertex = i;
            }
        }

        return minVertex;
    }

    public static int[] primAlgo(int[][] graph){
        int V = graph.length;

        int[] key = new int[V];

        for(int i = 0; i < V; i++){
            key[i] = Integer.MAX_VALUE;
        }

        boolean[] mstSet = new boolean[V];
        int[] parent = new int[V];

        mstSet[0] = true;
        parent[0] = -1;

        for(int i = 0; i < V - 1; i++){

            int nextVertex = minKey(key, mstSet);

            mstSet[nextVertex] = true;

            for(int v = 0; v < V; v++){
                if(!mstSet[v] && graph[nextVertex][v] != 0 && key[v] > graph[nextVertex][v]){
                    key[v] = graph[nextVertex][v];
                    parent[v] = nextVertex;
                }
            }
        }

        return key;
    }
}
