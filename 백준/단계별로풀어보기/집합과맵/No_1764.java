package 백준.단계별로풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;


// 듣보잡
public class No_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int none_heard_count = Integer.parseInt(stringTokenizer.nextToken());
        int none_see_count = Integer.parseInt(stringTokenizer.nextToken());

        Map<String, String> none = new HashMap<>();

        for(int i = 0; i < none_heard_count; i++) none.put(bufferedReader.readLine(), null);

        List<String> list = new ArrayList<>();
        for(int i = 0; i < none_see_count; i++) {
            String val = bufferedReader.readLine();
            if(none.containsKey(val)) list.add(val);
        }
        //사전 순 정렬
        Collections.sort(list);

        //출력 만들기
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(list.size()).append("\n");
        for(String str : list) {
            stringBuilder.append(str).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
