package 프로그래머스.Lv2.SummerWinterCoding2018;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 점프와순간이동 {
    static int Solution(int n) {

        int count = 0;
        while(1 <= n) {
            if(n % 2 == 0) {
                n /= 2;
            }else {
                n -= 1;
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Solution(Integer.parseInt(bufferedReader.readLine())));
    }
}
