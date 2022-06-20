package Algorithms.회사.ssg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1 {
    static int count = 0;
    static int solution(int[] v, int a, int b) {

        //오름차순 정렬
        Arrays.sort(v);

        System.out.println(count+":"+v[0]+":"+v[1]+":"+v[2]);
        //재귀 종료 조건
        if(v[0] < b || v[v.length-1] < a) {
            return count;
        }
        //선두열의 연료를 a 만큼 차감
        v[v.length-1] -= a;
        //후미열의 연로를 b만큼 차감
        for(int i = 0; i < v.length-1; i++) {
            v[i] -= b;
        }

        // 횟수를 증가시키고 재귀 반복
        count++;
        return solution(v, a, b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(),",");
        int[] v = new int[count];
        for(int i = 0; i < count; i++) {
            v[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        System.out.println(solution(v, a, b));

    }
}
