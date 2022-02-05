package Algorithms.백준.단계별로풀어보기.for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 10871 X보다 작은 수
public class Step11 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());	// n과 x 입력받기
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if(a[i] < x)
                bw.write(a[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}