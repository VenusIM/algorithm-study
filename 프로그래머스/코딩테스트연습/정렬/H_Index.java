package Algorithms.프로그래머스.코딩테스트연습.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class H_Index {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = bufferedReader.readLine().split(",");

    }

    static int solution(int[] citations) {

        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            if(citations.length - i <= citations[i]) {
                answer = citations.length - i;
                break;
            }
        }

        return answer;
    }
}
