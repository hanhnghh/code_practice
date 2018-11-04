package Graphs;

public class HasDeadLock {
    public static boolean hasDeadlock(int[][] connections){
        int n = connections.length;

        boolean[] visited = new boolean[n];

        visited[0] = true;
        for(int i = 0; i < connections[0].length; i++){
            if(helper(connections, visited, connections[0][i]))
                return true;
        }

        return false;
    }

    private static boolean helper(int[][] connections, boolean[] visited, int nextPoint){
        for(int i = 0; i < connections[nextPoint].length; i++){
            if(visited[connections[nextPoint][i]]){
                return true;
            }

            visited[connections[nextPoint][i]] = true;
            if(helper(connections, visited, connections[nextPoint][i]))
                return true;
            visited[connections[nextPoint][i]] = false;
        }
        return false;
    }
}
