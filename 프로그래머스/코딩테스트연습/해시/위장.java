package 프로그래머스.코딩테스트연습.해시;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 위장 {

    public static void main(String[] args) {

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));

        clothes = new String[][]{{"crow_mask", "face"}};
        System.out.println(solution(clothes));

    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> clothes_map = new HashMap<>();

        // 정보 셋팅
        for(int i = 0; i < clothes.length; i++) {
            clothes_map.put(clothes[i][1], clothes_map.getOrDefault(clothes[i][1], 0)+1);
        }

        Iterator<Integer> it = clothes_map.values().iterator();
        // 해당 종류의 옷을 안입는 경우를 고려하여 +1
        while (it.hasNext()) answer *= it.next() + 1;

        // 아무것도 입지 않는 경우를 제거
        return answer-1;
    }
}

