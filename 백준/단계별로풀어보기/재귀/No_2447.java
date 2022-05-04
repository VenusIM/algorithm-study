package Algorithms.백준.단계별로풀어보기.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No_2447 {
    static StringBuilder[] stringBuilders;

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        stringBuilders = new StringBuilder[N];
        String s = String.format("%" + N + "s" , ' ');
        for(int i = 0; i < N; i++) stringBuilders[i] = new StringBuilder(s);


        star(0, 0, N);
        for (int i = 0; i < N; i++) System.out.println(stringBuilders[i]);

    }

    static void star(int x, int y, int N) {

        if (N == 1) {
            stringBuilders[x].setCharAt(y, '*');
            return;
        }

        int size = N / 3;
        int count = 0;
        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count != 5) star(i, j, size);
            }
        }
    }
}
