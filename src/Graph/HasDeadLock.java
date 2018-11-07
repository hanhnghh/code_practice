package Graph;

public class HasDeadLock {

    public static boolean hasDeadlock(int[][] connections) {
        int n = connections.length;
        boolean[][] graph = new boolean[n][];
        boolean[] visited = new boolean[n];

        graph[0][0] = true;
        for(int i = 0; i < connections[0].length; i++)
            if(!helper(connections, visited, graph, 0, i))
                return true;

        return false;
    }

    private static boolean helper(int[][] connections, boolean[] visited, boolean[][] graph, int start, int next){

        for(int i = 0; i < connections[next].length; i++){
            if(!graph[next][connections[next][i]]) {
                if(visited[connections[next][i]])
                    return false;

                graph[next][connections[next][i]] = true;
                visited[connections[next][i]] = true;
                helper(connections, visited, graph, next, connections[next][i]);
                graph[next][connections[next][i]] = false;
                visited[connections[next][i]] = false;
            }
        }
        return true;
    }
}
