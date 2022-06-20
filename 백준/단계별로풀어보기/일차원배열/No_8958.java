package Algorithms.백준.단계별로풀어보기.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 8958 제목 OX퀴즈
public class No_8958 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        String str;
        int[] oxs = new int[count];

        for(int i = 0; i < count; i++) {

            str = bufferedReader.readLine();
            int[] ox = new int[str.length()];

            for(int j = 0; j < str.length(); j++) {
                if(Character.compare(str.charAt(j), 'O') == 0) {
                    if(j != 0) {
                        ox[j] = ox[j-1] + 1;
                    }else{
                        ox[j] = 1;
                    }
                }
            }

            int total = 0;
            for(int num : ox) {
                total += num;
            }
            oxs[i] = total;
        }

        for(int num : oxs) {
            System.out.println(num);
        }
    }
}
