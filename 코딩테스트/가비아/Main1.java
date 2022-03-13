package Algorithms.코딩테스트.가비아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = bufferedReader.readLine().split(" ");

        int mod1 = Integer.parseInt(nums[0]);
        int mod2 = Integer.parseInt(nums[1]);
        int max_range = Integer.parseInt(nums[2]);

        System.out.println(solution(mod1,mod2,max_range));
    }

    static int solution(int mod1, int mod2, int max_range) {

        int answer = -1;

        if(mod1 == mod2) {
            answer = 0;
        }else if(mod2 % mod1 == 0) {
            answer = max_range/mod1 - max_range/mod2;
        }else if(mod1 % mod2 == 0) {
            answer = 0;
        }else {
            answer = max_range/mod1 - max_range/(mod1 * mod2);
        }

        return answer;
    }
}
