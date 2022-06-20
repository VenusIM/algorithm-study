package Algorithms.회사.estsoft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    public int solution(String[] scores) {

        //합격자 수
        int count = 0;

        //지원자들의 점수 코드를 하나씩 확인
        for(int i = 0; i < scores.length; i++) {

            int count_A = 0; //A의 개수
            int count_F = 0; //F의 개수
            int min = 5; //아스키코드 @
            int max = 0; //아스키코드 G

            //점수 문자열
            String score = scores[i];

            //점수 코드를 보관할 배열
            int[] arr = new int[score.length()];

            //문자를 하나씩 확인
            for(int j = 0; j < score.length(); j++) {

                int c = Math.abs(score.charAt(j)-70);
                arr[j] = c;

                //A의 개수와 F의 개수
                if(c == 'A') count_A++;
                if(c == 'F') count_F++;
                //최소 최대
                if(min > c) min = c;
                if(max < c) max = c;
            }
            //1번 조건
            if(2 <= count_F) continue;
            //2번 조건
            if(2 <= count_A) count++;
            //3번 조건
            else {
                int total = 0;
                for(int num : arr) {
                    total += num;
                }
                System.out.println(total);
                total -= min;
                total -= max;

                double avg = (double) total / (arr.length-2);

                if(3 <= avg) count++;
                System.out.println(total+":"+avg);
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        String[] arr = new String[count];
        for(int i = 0; i < count; i++) {
            arr[i] = bufferedReader.readLine();
        }
        System.out.println(new Solution1().solution(arr));
    }
}
