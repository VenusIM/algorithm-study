package 백준.단계별로풀어보기.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int x = 0;
        int y = 0;
        int value = 0;
        int max = 0;
        for(int i = 1;  i <= 9; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for(int j = 1; j <= 9; j++) {
                value = Integer.parseInt(stringTokenizer.nextToken());
                if(max <= value) {
                    max = value;
                    x = i;
                    y = j;
                }
            }
        }

        System.out.print(max+"\n"+x+" "+y);
    }
}
