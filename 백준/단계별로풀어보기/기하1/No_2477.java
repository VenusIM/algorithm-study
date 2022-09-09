package 백준.단계별로풀어보기.기하1;

import java.io.*;

public class No_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());

        int[] figure = new int[4];

        String temp;
        int index;
        boolean flag = true;
        for(int i = 0; i < 6; i++) {
            temp = bufferedReader.readLine();
            index = temp.charAt(0) - 49;

            if(flag && figure[index] != 0) {
                flag = false;
                continue;
            }

            figure[index] = Integer.parseInt(temp.substring(2));
        }

        int max_x = figure[0] < figure[1] ? 1 : 0;
        int max_y = figure[2] < figure[3] ? 3 : 2;
        int min_x = Math.abs(max_x - 1);
        int min_y = Math.abs(max_y - 1);

        int area = figure[max_x] * figure[max_y] - (figure[max_x] - figure[min_x]) * (figure[max_y] - figure[min_y]);
        bufferedWriter.write(String.valueOf(area * count));
        bufferedWriter.close();
        bufferedReader.close();
    }
}
