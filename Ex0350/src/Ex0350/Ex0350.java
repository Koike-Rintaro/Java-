package Ex0350;

import java.util.ArrayList;
import java.util.Collections;

public class Ex0350 {

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {

        int[][] graph = {
                {0,4,5,0,2,0,0},
                {4,0,6,4,3,0,0},
                {5,6,0,6,0,0,10},
                {0,4,6,0,6,2,6},
                {2,3,0,6,0,9,0},
                {0,0,0,2,9,0,3},
                {0,0,10,6,0,3,0}
        };

        int n = graph.length;

        int[] dist = new int[n];
        boolean[] fixed = new boolean[n];
        int[] prev = new int[n];

        // 初期化
        for(int i = 0; i < n; i++) {
            dist[i] = INF;
            prev[i] = -1;
        }

        dist[0] = 0;

        while(true) {

            int min = INF;
            int v = -1;

            // 未確定頂点の中から最小距離を探す
            for(int i = 0; i < n; i++) {
                if(!fixed[i] && dist[i] < min) {
                    min = dist[i];
                    v = i;
                }
            }

            if(v == -1) {
                break;
            }

            fixed[v] = true;

            // 隣接頂点を更新
            for(int i = 0; i < n; i++) {

                if(graph[v][i] != 0 && !fixed[i]) {

                    if(dist[i] > dist[v] + graph[v][i]) {
                        dist[i] = dist[v] + graph[v][i];
                        prev[i] = v;
                    }
                }
            }
        }

        // 最短経路を復元
        ArrayList<Integer> path = new ArrayList<>();

        for(int v = 6; v != -1; v = prev[v]) {
            path.add(v);
        }

        Collections.reverse(path);

        // 最短経路上の頂点だけ表示
        for(int vertex : path) {
            System.out.println("頂点" + vertex + "確定。 距離=" + dist[vertex]);
        }
    }
}