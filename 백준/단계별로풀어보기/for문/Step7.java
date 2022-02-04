package 백준.단계별로풀어보기.for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 11021 문제 A+B-7
public class Step7 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuffer result = new StringBuffer();

        for(int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            result.append("Case #" + (i + 1) + ": "
                    + (Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1])) + "\n");
        }

        System.out.println(result);
    }
}
