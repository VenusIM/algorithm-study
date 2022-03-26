package Algorithms.프로그래머스.코딩테스트연습.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H_Index {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numStr = bufferedReader.readLine();
        numStr = numStr.substring(1, numStr.length()-1).replaceAll(" ","");
        String[] strs = numStr.split(",");

        int[] citations = new int[strs.length];

        for(int i = 0; i < strs.length; i++) {
            citations[i] = Integer.parseInt(strs[i]);
        }

        System.out.print(solution(citations));

    }

    static int solution(int[] citations) {



        return 0;
    }
}
