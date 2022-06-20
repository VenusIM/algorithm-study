package Algorithms.백준.단계별로풀어보기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 10757 큰 수 a+b
public class No_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String A = stringTokenizer.nextToken();
        String B = stringTokenizer.nextToken();

        Stack<Integer> stack = new Stack<>();
        int length = A.length() < B.length() ? B.length() : A.length();

        int up = 0;
        for(int i = 0; i < length; i++) {
            int value = 0;
            if(0 <= A.length()-1-i && 0 <= B.length()-1-i) {
                value = (int)A.charAt(A.length()-1-i) + (int)B.charAt(B.length()-1-i)-96;
                if(up == 1) {
                    value++;
                    up = 0;
                }
                if(10 <= value) {
                    stack.push(value-10);
                    up = 1;
                }else stack.push(value);
            }else if(A.length() < B.length()) {
                if(up == 1) {
                    up = 0;
                    stack.push((int)B.charAt(B.length()-1-i) - 47);
                }
                else stack.push((int)B.charAt(B.length()-1-i)-48);
            }else if(B.length() < A.length()) {
                if(up == 1) {
                    up = 0;
                    stack.push((int)A.charAt(A.length()-1-i) - 47);
                }
                else stack.push((int)A.charAt(A.length()-1-i)-48);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        if(up == 1) stringBuilder.append(1);
        while (!stack.isEmpty()) stringBuilder.append(stack.pop());

        System.out.print(stringBuilder);
    }
}
