package 백준.단계별로풀어보기.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_16139_100점 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S =  bufferedReader.readLine();
        int[][] arr = new int[S.length()][26];

        // 초기값 세팅
        arr[0][S.charAt(0)-97]++;

        for(int i = 1; i < S.length(); i++) {
            int index = S.charAt(i) - 97; // 'a' = 97
            for(int j = 0; j < 26; j++) {
                arr[i][j] = arr[i-1][j];
                if(j == index) { // 현재 알파벳과 같은 인덱스라면
                    arr[i][j]++;
                }
            }
        }

        int q = Integer.parseInt(bufferedReader.readLine());


        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < q; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int alphabet = stringTokenizer.nextToken().charAt(0) - 97;
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append(arr[end][alphabet] - (start == 0 ? 0 : arr[start-1][alphabet])).append("\n");
        }

        System.out.print(stringBuilder);
    }

}
