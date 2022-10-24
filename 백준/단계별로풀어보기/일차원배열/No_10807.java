package 백준.단계별로풀어보기.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        String checkNum = bufferedReader.readLine();
        int result = 0;
        for(int i = 0; i < N; i++) {
            if(checkNum.equals(stringTokenizer.nextToken())) {
                result++;
            }
        }
        System.out.print(result);
    }
}
