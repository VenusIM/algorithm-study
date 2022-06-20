package Algorithms.프로그래머스.Lv2.위클리챌린지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 피로도 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bufferedReader.readLine()); // 현재 피로도

        int[][] dengeons = new int[8][2];
        String tmp;
        int count  = 0;
        while(true) {
            tmp = bufferedReader.readLine();
            if(tmp.equals("")) break;
            StringTokenizer stringTokenizer = new StringTokenizer(tmp,",");
            dengeons[count][0] = Integer.parseInt(stringTokenizer.nextToken()); // 최소 피로도
            dengeons[count][1] = Integer.parseInt(stringTokenizer.nextToken()); // 소모 피로도
            count++;
        }
        solution(k, dengeons);
    }
    static boolean[] check = new boolean[8];
    static int solution(int k, int[][] dengeons) {

        int result = 0;
        //최소 피로도 기준 오름차순 정렬
        Arrays.sort(dengeons,(o1,o2) -> {
            if(o1[0] == o2[0]) return o1[1] - o1[1];
            else return o1[0] - o2[0];
        });


        for(int i = 0; i < dengeons.length; i++) {
            if(!check[i]) continue;
            if(dengeons[i][0] < k);
        }

        return result;
    }
}
