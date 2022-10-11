package 백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        while(num >= 5) {
            result += num/5;
            num /= 5;
        }
        System.out.print(result);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(bufferedReader.readLine());
//        int result = 0;
//        for(int i = 5; i <= num; i++) {
//            if(i % 5 == 0) {
//                result += div(i, 0);
//            }
//        }
//        System.out.print(result);
//    }
//
//    static int div(int check, int subResult) {
//        if(check == 0) {
//            return subResult;
//        }
//        return div(check/5, ++subResult);
//    }
}
