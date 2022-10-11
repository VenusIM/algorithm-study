package 백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_9375 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<String , Integer> clothesMap;
        int testCase = Integer.parseInt(bufferedReader.readLine());

        int clothesCount;
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        String clothes;

        for(int i = 0; i < testCase; i++) {
            clothesMap = new HashMap<>();
            clothesCount = Integer.parseInt(bufferedReader.readLine());
            for(int j = 0; j < clothesCount; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                stringTokenizer.nextToken();
                clothes = stringTokenizer.nextToken();
                if(clothesMap.containsKey(clothes)) {
                    clothesMap.put(clothes, clothesMap.get(clothes)+1);
                    continue;
                }
                clothesMap.put(clothes, 2);
            }
            stringBuilder.append(combination(clothesMap));
            if(i < testCase-1) {
                stringBuilder.append("\n");
            }
        }
        System.out.print(stringBuilder);
    }

    static int combination(Map<String, Integer> clothes) {
        int result = 1;
        for(String str : clothes.keySet()) {
            result *= clothes.get(str);
        }
        return --result;
    }
}
