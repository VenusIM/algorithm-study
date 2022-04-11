package Algorithms.백준.단계별로풀어보기.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        //Test Case 만큼 반복
        for(int i = 0; i < T; i++) {
            String function = bufferedReader.readLine();

            int n = Integer.parseInt(bufferedReader.readLine());
            String arr = bufferedReader.readLine();
            arr = arr.substring(1, arr.length()-1);

            StringTokenizer stringTokenizer = new StringTokenizer(arr, ",");

            for(int j = 0; j < n; j++) deque.add(Integer.parseInt(stringTokenizer.nextToken()));

            //에러인지 아닌지 판단
            boolean error = false;
            //반전인지 아닌지 판단
            boolean reverse = false;
            for(int j = 0; j < function.length(); j++) {
                char value = function.charAt(j);
                //반전 여부 결정
                if(value == 'R') {
                    if(reverse) reverse = false;
                    else reverse = true;
                }else {
                    //덱이 비어있는 상태라면 에러를 참으로 설정
                    if(deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    // 반전이라면 뒤에서 값을 제외해준다.
                    else if(reverse) deque.pollLast();
                    else deque.poll();
                }
            }
            if(error) {
                stringBuilder.append("error");
            } else {
                stringBuilder.append("[");

                if(reverse) {
                    //마지막에는 ,가 들어가면 안되므로 크기가 1보다 클 때까지만 진행
                    while(1 < deque.size()) stringBuilder.append(deque.pollLast()).append(",");
                }else {
                    while(1 < deque.size()) stringBuilder.append(deque.poll()).append(",");
                }
                // 덱이 비어있을 경우 나오는 null 방지
                if(deque.isEmpty()) stringBuilder.append("]");
                else stringBuilder.append(deque.poll()).append("]");
            }
            if(i < T - 1) stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
