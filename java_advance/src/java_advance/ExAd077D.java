package java_advance;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class ExAd077D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("＞");
        int N = sc.nextInt();

        int[] dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Deque<Integer> deque = new ArrayDeque<>();

        dist[1 % N] = 1;
        deque.add(1 % N);

        while (!deque.isEmpty()) {

            int cur = deque.pollFirst();

            int next0 = (cur * 10) % N;

            if (dist[next0] > dist[cur]) {
                dist[next0] = dist[cur];
                deque.addFirst(next0);
            }

            int next1 = (cur + 1) % N;

            if (dist[next1] > dist[cur] + 1) {
                dist[next1] = dist[cur] + 1;
                deque.addLast(next1);
            }
        }

        System.out.println(dist[0]);
        sc.close();
    }
}
