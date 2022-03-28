package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1181번 단어 정렬
public class Step8 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        String[] arr = new String[count];

        for(int i = 0; i < count; i++) {
            arr[i] = bufferedReader.readLine();

        }

        //2차원 배열 정렬 Comparator 우선순위 재정의 람다식 사용
        //new Comparator(String o1, String o2)와 동일
        Arrays.sort(arr, (o1, o2) -> {

            // 첫번째 값이 동일하면 2번째 값을 비교
            if (o1.length() == o2.length()) {

                //문자를 사전 순서대로 정렬
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {

            if(i == 0) {
                stringBuilder.append(arr[0]).append("\n");

            }else if(!arr[i - 1].equals(arr[i])) {
                stringBuilder.append(arr[i]);

                if(i != count - 1) {
                    stringBuilder.append("\n");
                }
            }

        }

        System.out.print(stringBuilder);

    }
}
