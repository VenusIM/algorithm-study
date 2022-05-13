package Algorithms.백준.단계별로풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        Map<Integer, String> dictA = new HashMap<>();
        Map<String, Integer> dictB = new HashMap<>();

        for(int i = 0; i < N; i++) {
            String name = bufferedReader.readLine();
            dictA.put(i+1, name);
            dictB.put(name, i+1);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < M; i++) {
            String key = bufferedReader.readLine();
            if(dictB.containsKey(key)) stringBuilder.append(dictB.get(key));
            else stringBuilder.append(dictA.get(Integer.parseInt(key)));
            stringBuilder.append("\n");
        }

        System.out.print(stringBuilder);

    }
}
