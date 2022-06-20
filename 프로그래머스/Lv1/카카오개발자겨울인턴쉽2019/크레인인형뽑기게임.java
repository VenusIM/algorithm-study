package Algorithms.프로그래머스.Lv1.카카오개발자겨울인턴쉽2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 크레인인형뽑기게임 {
    static int solution(int[][] board, int[] moves) {

        //인형뽑기 초기 세팅
        Stack[] stacks = new Stack[board[0].length];
        for (int i = 0; i < board[0].length; i++) stacks[i] = new Stack<Integer>();

        //2차원 배열을 하나씩 뽑아가며 스택으로 변환
        for (int i = board[0].length-1; 0 <= i ; i--) {
            for (int j = board[0].length-1; 0 <= j ; j--) {
                if(board[i][j] == 0) continue;
                stacks[j].push(board[i][j]);
            }
        }

        int value;
        int answer = 0;

        //뽑은 인형을 담을 스택
        Stack<Integer> cart = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int line = moves[i]-1;
            //인형뽑기 해당 라인이 비어있다면 넘어감
            if(stacks[line].isEmpty()) continue;

            // 아니라면 값을 뽑음
            value = (int) stacks[line].pop();
            //카트가 비어있지 않고 넣을 인형과 기존 인형이 같다면
            if (!cart.isEmpty() && cart.peek() == value) {
                cart.pop();
                answer += 2;
            } else cart.push(value);
        }
        return answer;
    }
}

