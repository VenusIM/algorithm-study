package Algorithms.백준.단계별로풀어보기.합집합찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1717 집합의 표현
public class Step1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        int[] union = new int[n+1];
        for(int i = 0; i <= n; i++) union[i] = i;


        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int command = Integer.parseInt(stringTokenizer.nextToken());
            int numA = Integer.parseInt(stringTokenizer.nextToken());
            int numB = Integer.parseInt(stringTokenizer.nextToken());

            if(command == 1) {

                if(numA == numB) stringBuilder.append("YES");
                else stringBuilder.append("NO");
                if(i != m-1) stringBuilder.append("\n");

            }else {
                addUnion(union, numA, numB);
            }
        }

        System.out.print(stringBuilder);
    }

    static int getParent(int[] union, int a) {
        if(union[a] == a) return a;
        return union[a] = getParent(union,union[a]);
    }

    static void addUnion(int[] union, int numA, int numB) {
        numA = getParent(union, union[numA]);
        numB = getParent(union, union[numB]);
        if(numA < numB) union[numB] = numA;
        else union[numA] = numB;
    }

}
