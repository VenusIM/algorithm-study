package 백준.단계별로풀어보기.입출력과사칙연산;

import java.io.*;

// 킹, 퀸, 룩, 비숍, 나이트, 폰
public class No_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bufferedReader.readLine();
        char[] chess = {'1','1','2','2','2','8'};

        int index = 0;
        int checkNum = 0;
        while(true) {
            if(checkNum == 6) break;
            bufferedWriter.write(chess[checkNum] - str.charAt(index));
            bufferedWriter.write(" ");
            checkNum++;
            index += 2;
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

}
