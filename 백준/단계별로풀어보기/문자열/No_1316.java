package Algorithms.백준.단계별로풀어보기.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1316 문제 그룹 단어 체커
public class No_1316 {

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{

        int count = 0;
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() throws Exception {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = bufferedReader.readLine();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {

                if ( check[now - 'a'] == false ) {
                    check[now - 'a'] = true;
                    prev = now;
                }

                else {
                    return false;
                }
            }

            else {
                continue;
            }
        }
        return true;
    }
}