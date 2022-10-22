package 백준.단계별로풀어보기.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_16139_50점 {

    static String S;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        S =  bufferedReader.readLine();
        int q = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < q; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            stringBuilder.append(
                                countString(
                                            stringTokenizer.nextToken(),
                                            Integer.parseInt(stringTokenizer.nextToken()),
                                            Integer.parseInt(stringTokenizer.nextToken())
                                )
            ).append("\n");
        }

        System.out.print(stringBuilder);
    }

    static int countString(String str, int start, int end) {
        int result = 0;
        String temp = S.substring(start, end+1);
        int index;
        while(true) {
            index = temp.indexOf(str);
            if(index == -1) {
                break;
            }
            temp = temp.substring(index+1);
            result++;
        }
        return result;
    }

}
