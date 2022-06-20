package Algorithms.프로그래머스.Lv2.팁스타운2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 짝지어제거하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        System.out.print(Soution(str));
    }

    static int Soution(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty()) stack.push(str.charAt(i));
            else if (stack.peek() == str.charAt(i)) stack.pop();
            else stack.push(str.charAt(i));
        }
        if (stack.isEmpty()) return 1;
        return 0;
    }
}
