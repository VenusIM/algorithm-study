package Algorithms.백준.단계별로풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No_14425_Map {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        HashMap<String, Integer> map = new HashMap<>();

        int count = 0;

        for (int i = 0; i < N; i++) map.put(bufferedReader.readLine(), 0);

        for (int i = 0; i < M; i++) {
            if (map.containsKey(bufferedReader.readLine())) count++;

        }
        System.out.print(count);
    }
}