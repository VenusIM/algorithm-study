package 백준.단계별로풀어보기.반복문;

import java.io.*;

// 영수증
public class No_25304 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalPrice = Integer.parseInt(bufferedReader.readLine());
        int totalCount = Integer.parseInt(bufferedReader.readLine());

        int checkPrice = 0;

        String str = "";
        for(int i = 0; i < totalCount; i++) {
            str = bufferedReader.readLine();
            checkPrice += Integer.parseInt(str.substring(0, str.indexOf(" "))) * Integer.parseInt(str.substring(str.indexOf(" ") + 1));
        }

        bufferedWriter.write( (checkPrice == totalPrice) ? "Yes" : "No" );
        bufferedWriter.close();
        bufferedReader.close();
    }
}
