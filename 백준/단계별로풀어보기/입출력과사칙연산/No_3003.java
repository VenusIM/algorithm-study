package 백준.단계별로풀어보기.입출력과사칙연산;


import java.io.*;
import java.util.StringTokenizer;

// 킹, 퀸, 룩, 비숍, 나이트, 폰
public class No_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bufferedReader.readLine();
        int[] chess = {1,1,2,2,2,8};

        StringTokenizer stringTokenizer = new StringTokenizer(str);

        int index = 0;
        while (true){
            bufferedWriter.write(String.valueOf(chess[index] - Integer.parseInt(stringTokenizer.nextToken())));
            index++;
            if(index == 6) {
                break;
            }else {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
