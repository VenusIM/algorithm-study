package Algorithms.백준.단계별로풀어보기.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//11866번 요세푸스 문제 0
public class Step3 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = bufferedReader.readLine().split(" ");

        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");

        //K가 1일 경우
        if(K == 1) {
            for(int i = 1; i < N; i++) {
                stringBuilder.append(i).append(", ");
            }
            stringBuilder.append(N).append(">");
            System.out.print(stringBuilder);
            return;
        }

        Queue<Integer> queue = new LinkedList<Integer>();

        int count = 0;

        //K는 N보다 작거나 같다는 조건이 있기 때문에 K의 배수중 최대값 보다 큰 수를 queue 에 먼저 삽입
        for(int i = N/K*K + 1; i <= N; i++) {
            queue.add(i);
            count++;
        }

        // 1부터 K의 배수 최대 값까지
        for(int i = 1; i <= N/K*K; i++) {
            // 나누어 떨어질 경우 바로 추가
            if(i%K == 0) {
                stringBuilder.append(i).append(", ");
            }
            //아닐 경우 큐에 값을 하나씩 삽입
            else {
                queue.add(i);
            }
        }

        // 위의 코드로 인해 queue는 K의 배수 최대값 + 1 부터 K의 배수 최대값까지 샛팅 됨.

        while (!queue.isEmpty()) {

            int i = 0;
            // K - 1회 만큼 뽑아서 뒤에 다시 넣어주고,
            while(i < K - 1) {
                queue.add(queue.poll());
                i++;
            }
            // K회 차례 임으로 queue에서 제거 후 추가
            stringBuilder.append(queue.poll());

            //queue가 비어 있지 않을 경우 뽑아서 추가후 , 삽입
            if(!queue.isEmpty()) stringBuilder.append(", ");
            //마지막일 경우 >로 마무리
            else stringBuilder.append(">");

        }
        System.out.print(stringBuilder);
    }
}
