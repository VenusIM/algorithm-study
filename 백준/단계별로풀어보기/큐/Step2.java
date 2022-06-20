package Algorithms.백준.단계별로풀어보기.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 2164번 카드2
public class Step2 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());


        if(num <= 2) {
            System.out.print(num);
            return;
        }

        Queue<Integer> queue = new LinkedList<Integer>();

        boolean condition = true;

        if(num % 2 != 0) {
            num--;
            condition = false;
        }

        // 홀수는 무조건 제거되기 때문에 짝수만 queue에 삽입
        for(int i = 2; i <= num; i += 2) {
            queue.add(i);
        }

        //짝수 일 경우 짝수가 내려가는것으로 마무리 되고 짝수 제거 부터 시작
        while(condition && 1 < queue.size()) {
            queue.poll();
            queue.add(queue.poll());
        }

        //홀수 일 경우 홀수가 제거되는 것으로 마무리 되고 짝수 내리고 부터 시작
        while(!condition && 1 < queue.size()) {
            queue.add(queue.poll());
            queue.poll();
        }

        System.out.print(queue.peek());

    }
}
