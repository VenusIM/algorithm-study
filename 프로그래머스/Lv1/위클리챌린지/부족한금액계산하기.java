package Algorithms.프로그래머스.Lv1.위클리챌린지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부족한금액계산하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bufferedReader.readLine().split(",");

        System.out.print(solution2(
                Integer.parseInt(strs[0]),
                Integer.parseInt(strs[1]),
                Integer.parseInt(strs[2])
                ));

        System.out.print(solution2_1(
                Integer.parseInt(strs[0]),
                Integer.parseInt(strs[1]),
                Integer.parseInt(strs[2])
        ));
    }

    // 첫번쨰 풀이
    static long solution2(int price, int money, int count) {
        long answer = 0;

        for(int i = 1; i <= count; i++) {
            answer += price*i;
        }
        answer -= money;

        if(answer < 0)
            answer = 0;

        return answer;
    }

    // 두번째 풀이 등차 수열의 합 공식 이용 n(n+1)/2
    static long solution2_1(int price, int money, int count) {
        long answer = price * (count * (count + 1) / 2) - money;
        return answer < 0 ? 0 : answer;
    }

    // Math.Max()를 이용하면 돈이 남을 경우의 조건을 걸어주지 않아도 된다.
}
