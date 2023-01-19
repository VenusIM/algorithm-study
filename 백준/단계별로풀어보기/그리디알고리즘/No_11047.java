package 백준.단계별로풀어보기.그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11047 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;
        try {
            st = new StringTokenizer(br.readLine(), " ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];

        for(int i = 0; i < N; i++) {
            try {
                coin[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int count = 0;

        for(int i = N - 1; i >= 0; i--) {
            if(coin[i] <= K) {
                count += (K / coin[i]);
                K = K % coin[i];
            }
        }
        System.out.println(count);
    }
}
