package 백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        int n, m;

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < test; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            n = Integer.parseInt(stringTokenizer.nextToken());
            m = Integer.parseInt(stringTokenizer.nextToken());
            if(n == m) stringBuilder.append(1);
            else stringBuilder.append(combination(m,n));
            if(i < test-1) {
                stringBuilder.append("\n");
            }
        }
        System.out.print(stringBuilder);
    }

    static long factorial(long num, long result, long end) {
        if(num == end) return result;
        result *= num;
        num--;
        return factorial(num, result, end);
    }

    static long combination(int n, int r) {
        long end = (r < n - r) ? n - r : r;
        long other = n - end;
        return factorial(n, 1L, end) / factorial(other, 1L, 1L);
    }
}
