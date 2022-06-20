package Algorithms.프로그래머스.Lv1.카카오개발자겨울인턴쉽2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 튜플 {
    static int[] solution(String s) {
        //양쪽 중괄호 제거
        s = s.substring(2,s.length()-2);
        System.out.println(s);
        // ,기준으로 parsing
        StringTokenizer stringTokenizer = new StringTokenizer(s,"},{");

        System.out.println(stringTokenizer.nextToken());
        System.out.println(stringTokenizer.nextToken());
        int max = 0;
        Map<Integer, String> map = new HashMap<>();
        while(stringTokenizer.hasMoreTokens()) {
            String value = stringTokenizer.nextToken();
            System.out.println("value : "+value);
            StringTokenizer st = new StringTokenizer(value, ",");

            int count = st.countTokens();
            if(max < count) max = count;

            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < count; i++) stringBuilder.append(st.nextToken()).append(',');

            map.put(count, stringBuilder.toString());
        }

        int[] answer = new int[max];
        for(int i = 0; i < max; i++) {
            if(i == 0) answer[i] = Integer.parseInt(map.get(i));
            else answer[i] = Integer.parseInt(map.get(i).replace(map.get(i-1)+",",""));
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        solution(bufferedReader.readLine());
    }

}
