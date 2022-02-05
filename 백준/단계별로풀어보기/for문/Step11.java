package Algorithms.백준.단계별로풀어보기.for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 10871 문제 X보다 작은 수
// TODO: 2022-02-05 문제 발생 나중에 다시 보자.
public class Step11 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] NandX = bufferedReader.readLine().split(" ");

        int N = Integer.parseInt(NandX[0]);
        int X = Integer.parseInt(NandX[1]);

        String[] numList = bufferedReader.readLine().split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < N; i++) {
            if(Integer.parseInt(numList[i]) < 5) {
                stringBuilder.append(numList[i]).append(" ");
            }
        }
        System.out.print(stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(" ")));
    }
}
