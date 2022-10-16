package 백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] nums = new int[N];

        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(nums);
        int[] temp = new int[N];
        /**
         * A = M * a + R
         * B = M * b + R
         * C = M * c + R
         * B - A = M * (b-a)
         * C - B = M * (c-b)
         */
        for(int i = 1; i < N; i++) {
            temp[i-1] = nums[i] - nums[i-1];
        }

        int gcd = gcd(temp[0], temp[1]);
        for(int i = 2; i < N; i++) {
            gcd = gcd(gcd, temp[i]);
        }

        StringBuilder stringBuilder = new StringBuilder();
        //약수
        for(int i = 2 ; i <= Math.sqrt(gcd) ; i++) {
            if( gcd % i == 0 ) {
                stringBuilder.append(i).append(" ");
            }
        }
        stringBuilder.append(gcd);
        
        System.out.print(stringBuilder);
    }

    // M 최대 공약수
    static int gcd(int a, int b) {
        while(b!=0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
