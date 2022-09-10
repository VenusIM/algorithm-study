package 백준.단계별로풀어보기.기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1004 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int _case = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;

        for(int i = 0; i < _case; i++) {

            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int[] start = {  Integer.parseInt(stringTokenizer.nextToken()),
                    Integer.parseInt(stringTokenizer.nextToken())};

            int[] end = {  Integer.parseInt(stringTokenizer.nextToken()),
                    Integer.parseInt(stringTokenizer.nextToken())};

            int n = Integer.parseInt(bufferedReader.readLine());
            int count = 0;
            for(int j = 0; j< n; j++) {
                count = visitTime(start, end, bufferedReader.readLine(), count);
            }

            stringBuilder.append(count);
            if(i < _case-1) {
                stringBuilder.append("\n");
            }
        }
        System.out.print(stringBuilder);
        bufferedReader.close();
    }

    static int visitTime(int[] start, int[] end, String str, int count) {

        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        int x = Integer.parseInt(stringTokenizer.nextToken());
        int y = Integer.parseInt(stringTokenizer.nextToken());
        double r = Double.parseDouble(stringTokenizer.nextToken());

        double startR = Math.sqrt(Math.pow(start[0] - x, 2) + Math.pow(start[1] - y, 2));
        double endR = Math.sqrt(Math.pow(end[0] - x, 2) + Math.pow(end[1] - y, 2));
        double max = startR < endR ? endR : startR;
        double min = endR < max ? endR : startR;

        if(max < r){
            return count;
        }

        if(min < r) {
            count++;
        }

        return count;
    }
}
