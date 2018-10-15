package Tree;

public class DijkstraAlgo {

    private static int MAX_INTEGER = 9999999;

    private static int findMinIndex(int[] dist, boolean[] sptSet){
        int min = MAX_INTEGER;
        int v = 0;
        for(int i = 0; i < dist.length; i++){
            if(!sptSet[i]){
                if(dist[i] < min){
                    min = dist[i];
                    v = i;
                }
            }
        }
        return v;
    }

    public static int[] dijkstraAlgo(int[][] graph, int source){
        int V = graph.length;
        boolean[] sptSet = new boolean[V];

        int[] dist = new int[V];
        for(int i = 0; i < V; i++){
            dist[V] = MAX_INTEGER;
        }
        dist[source] = 0;

        for(int i = 0; i < V; i++) {

            int nextVertex = findMinIndex(dist, sptSet);

            sptSet[nextVertex] = true;

            for (int j = 0; j < V; j++) {
                if (!sptSet[j] && graph[nextVertex][j] != 0) {
                    if (dist[j] > dist[nextVertex] + graph[nextVertex][j]) {
                        dist[j] = dist[nextVertex] + graph[nextVertex][j];
                    }
                }
            }
        }

        return dist;
    }

}
