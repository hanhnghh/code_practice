package HeapStackQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CountClouds {
    public static int countClouds(char[][] skyMap) {
        char[][] emptySky = {};
        if(Arrays.equals(skyMap, emptySky)){
            return 0;
        }
        int rows = skyMap.length;
        int cols = skyMap[0].length;
        Queue<NodeQueue> queue = new LinkedList<>();
        int[][] visited = new int[rows][cols];
        for(int[] i : visited){
            for(int j : i){
                j = 0;
            }
        }

        int count = 0;
        int[] xMove = {-1, 0, 1, 0};
        int[] yMove = {0, -1, 0, 1};

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(skyMap[i][j] == '1' && visited[i][j] == 0){
                    count += 1;
                    queue.add(new NodeQueue(i, j));

                    while (!queue.isEmpty()){
                        NodeQueue node = queue.poll();
                        int x = node.x;
                        int y = node.y;
                        for(int step = 0; step < xMove.length; step++){
                                int tempX = x + xMove[step];
                                int tempY = y + yMove[step];
                                if(0 <= tempX && tempX < rows
                                            && 0 <= tempY && tempY < cols
                                            && visited[tempX][tempY] == 0
                                            && skyMap[tempX][tempY] == '1'
                                    ){
                                    queue.add(new NodeQueue(tempX, tempY));
                                    visited[tempX][tempY] = 1;
                                }
                        }
                    }
                }
            }
        }
        return count;
    }

     static class NodeQueue{
        int x, y;

        public NodeQueue(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
