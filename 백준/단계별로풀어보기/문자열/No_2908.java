package Algorithms.백준.단계별로풀어보기.문자열;

import java.util.Stack;

// 2908 문제 상수
public class No_2908 {
    public static void main(String[] args) throws Exception{

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < 3; i++) {
            stack.push((char)System.in.read());
        }

        System.in.read();

        for(int i = 0; i < 3; i++) {
            stack.push((char)System.in.read());
        }

        String firstNum = "";
        for(int i = 0; i < 3; i++) {
            firstNum += stack.pop();
        }
        String secondNum = "";
        for(int i = 0; i < 3; i++) {
            secondNum += stack.pop();
        }

        if(Integer.parseInt(firstNum) < Integer.parseInt(secondNum)) {
            System.out.print(secondNum);
        }else{
            System.out.print(firstNum);
        }
    }
}
